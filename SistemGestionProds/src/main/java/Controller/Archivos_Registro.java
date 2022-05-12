package Controller;

public class Archivos_Registro {
	private String nombre;
	private int clave,cantidad;
	private double precio;
	public Archivos_Registro(int clave, String nombre, double precio, int cantidad) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Archivos_Registro(int clave, String nombre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
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
