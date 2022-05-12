package Model;

public class Producto {
	private String nombre,nom;
	private int clave,cantidad, clav,cant;
	private double precio,prec;
	public Producto(String nombre, int clave, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.clave = clave;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
