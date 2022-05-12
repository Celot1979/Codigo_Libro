package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BBDD {
	private String driver;
	private String url;
	private String uss;
	private String  contra;
	private String nombre,nom;
	private int clave,cantidad, clav,cant;
	private double precio,prec;
	Statement stm =null;
	ResultSet productReSet;
	Producto ProductoHallado;
	private ArrayList<Producto> vector = new ArrayList<Producto>();
	
	public BBDD() {
		driver = "com.mysql.jdbc.Driver";
		url ="jdbc:mysql://127.0.0.1:3306/Thor";
		uss="root";
		contra="will220670";
		
	}
	
	
	public void resgistrar(int clave, String nombre,double precio,int cantidad) {
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			PreparedStatement miPr = miConexion.prepareStatement("SELECT * FROM product WHERE clave = ? AND nombre = ? AND precio = ? AND cantidad = ?  ", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			miPr.setInt(1, clave);
			miPr.setString(2,nombre);
			miPr.setDouble(3, precio);
			miPr.setInt(4, cantidad);
			ResultSet miRs = miPr.executeQuery();
			if(miRs.absolute(1)) {
				
				miConexion.close();
			}else {
				Statement miSt = miConexion.createStatement();
				String insSql ="INSERT INTO  product (clave,nombre,precio,cantidad) VALUES('"+clave+"','"+nombre+"','"+precio+"','"+cantidad+"')";
				miSt.executeUpdate(insSql);
				miConexion.close();
				
			}
		}catch(SQLException | ClassNotFoundException  e) {
			e.printStackTrace();
			System.out.println("No se ha podido hacer");
		}
	}
	
	public Producto Consultar(int clave, String nombre) {
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			stm = miConexion.createStatement();
			productReSet = stm.executeQuery("SELECT * FROM product WHERE clave ='"+clave+"'AND nombre='"+nombre+"'");
			if(!productReSet.next()) {
				System.out.println("No se encontro el registro");
				miConexion.close();
				return null;
			}else {
				System.out.println("SE ENCONTRO EL REGISTRO");
				clav = productReSet.getInt("clave");
				nom = productReSet.getString("nombre");
				prec = productReSet.getDouble("precio");
				cant = productReSet.getInt("cantidad");
				ProductoHallado = new Producto(nom,clav,prec,cant);
				miConexion.close();
				return ProductoHallado;
			}
		}catch(Exception e1) {
			System.out.println("Error en la base de datos");
			e1.printStackTrace();
			return null;
		}
		
	}
	public ArrayList<Producto> leerTodo(){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			stm =miConexion.createStatement();
			productReSet = stm.executeQuery("Select * From product");
			if(!productReSet.next()) {
				System.out.println("No se encuentran registros");
				miConexion.close();
				return null;
			}else {
				do {
					clav = productReSet.getInt("clave");
					nom = productReSet.getString("nombre");
					prec = productReSet.getDouble("precio");
					cant = productReSet.getInt("cantidad");
					ProductoHallado = new Producto(nom,clav,prec,cant);
					productos.add(ProductoHallado);
				}while(productReSet.next()) ;
					miConexion.close();
					return productos;
				
			}
		}catch(Exception e3) {
			System.out.println("Error en la base de datos");
			e3.printStackTrace();
			return null;
		}
	}
	
	public Connection prueba() {
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			System.out.println("Conectado");
			return miConexion;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la conexion");
			return null;
		}
		
	}
	
	

}
