package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Base_Datos {
	private String driver;
	private String url;
	private String uss;
	private String  contra;
	private String nombre,nom;
	private String clav,cuent,nom2,passw,mail;
	Statement stm =null;
	ResultSet productReSet,usuarioResultSet;
	private int control;
	Registro usuarioHallado;
	ArrayList <String> lista = new ArrayList<String>();
	//Producto ProductoHallado;
	//private ArrayList<Producto> vector = new ArrayList<Producto>();
	public Base_Datos() {
		super();
		driver = "com.mysql.jdbc.Driver";
		url ="jdbc:mysql://127.0.0.1:3306/Thor";
		uss="root";
		contra="will220670";
	}
	
	public Connection prueba() {
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			System.out.println("Conectado");
			control = 1;
			return miConexion;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			control = 2;
			System.out.println("Error en la conexion");
			return null;
			
		}
	}
	
	public void resgistrar(int clave,String cuenta,String nombre,String contra,String email) {
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			PreparedStatement miPr = miConexion.prepareStatement("SELECT * FROM cuenta WHERE clave = ? AND cuenta = ? AND nombre = ? AND contra = ?  AND email = ? ", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			miPr.setInt(1, clave);
			miPr.setString(2,cuenta);
			miPr.setString(3,nombre);
			miPr.setString(4,contra);
			miPr.setString(5,email);
			ResultSet miRs = miPr.executeQuery();
			if(miRs.absolute(1)) {
				
				miConexion.close();
			}else {
				Statement miSt = miConexion.createStatement();
				String insSql ="INSERT INTO  cuenta (clave,cuenta,nombre,contra,email) VALUES('"+clave+"','"+cuenta+"','"+nombre+"','"+contra+"','"+email+"')";
				miSt.executeUpdate(insSql);
				miConexion.close();
				
			}
		}catch(SQLException | ClassNotFoundException  e) {
			e.printStackTrace();
			System.out.println("No se ha podido hacer");
		}
	}
	public void Comprobar_Usuario(String nombre,String contra) {
		try {
			lista.add(nombre);
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			PreparedStatement miPr = miConexion.prepareStatement("SELECT * FROM cuenta WHERE nombre = ? AND contra =?", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			miPr.setString(1,nombre);
			miPr.setString(2,contra);
			ResultSet miRs = miPr.executeQuery();
			if(miRs.absolute(1)) {
				control = 1;
				//JOptionPane.showConfirmDialog(null, "Existe Usuario");
				
			}
			else {
				control = 2;
				
			}
			}catch(Exception e){
				 System.out.println("Error al registrar el driver de PostgreSQL: " + e);
			}
		
	}
	
	
	public boolean Resultado() {
		if(control == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public ArrayList<Registro> leeTodos(){
		ArrayList<Registro> usuarios=new ArrayList<Registro>();
		try {
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			prueba();
			stm =miConexion.createStatement();
			usuarioResultSet=stm.executeQuery("SELECT * FROM cuenta");
			if(!usuarioResultSet.next()) {
				System.out.println("No se encontraron regitros");
				miConexion.close();
				return null;
			}else {
				do {
					clav = usuarioResultSet.getString("clave");
					cuent = usuarioResultSet.getString("cuenta");
					nom2 = usuarioResultSet.getString("nombre");
					passw = usuarioResultSet.getString("contra");
					mail = usuarioResultSet.getString("email");
					usuarioHallado= new Registro(clav,cuent,nom2,passw,mail);
					usuarios.add(usuarioHallado);
					
				}while(usuarioResultSet.next());
					miConexion.close();
					return usuarios;
				
			}
			
		}catch(Exception e) {
			System.out.println("Error en la lectura de registrados");
			System.out.println("Culpa en le método de lectura de ArrayList");
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public boolean borrar(String clave, String cuenta){
		int resultUpdate = 0;
		try{
			Class.forName(this.driver);
			Connection miConexion = DriverManager.getConnection(this.url,this.uss,this.contra);
			stm =miConexion.createStatement();
			resultUpdate= stm.executeUpdate("DELETE FROM cuenta WHERE (clave ='"+clave+"' AND clave = '"+cuenta+"');");
			System.out.println("Ha llegado hasta archivo Base_Datos, antes de entrar en el condicional");
			/*if(resultUpdate != 0) {
				System.out.print("Borrado con éxito");
				miConexion.close();
				return true;
			}else {
				miConexion.close();
				return false;
			}*/
			if(resultUpdate != 0) {
				String consulta = "DELETE FROM cuenta WHERE clave = ? , cuenta =? ";
				PreparedStatement ps = miConexion.prepareStatement(consulta);
			    ps.setString(1, clave);  // ps.setInt(1, idGaleria); <--- En caso de ser INT
			    ps.setString(2, cuenta);
			    ps.executeQuery();
			    miConexion.close();
				return true;
			}else {
				miConexion.close();
				return false;
			}
				
		}catch(Exception e3) {
			e3.printStackTrace();
			System.out.println("Error al borrar un registro");
			return false;
		}
	}
	
}
	
	

