package Guardar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Archivos {
private String clave,nombre,precio,cantidad,ruta;
private static int num_art;
public Archivos(String clave, String nombre, String precio, String cantidad) {
	super();
	this.clave = clave;
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
	this.num_art +=1;
}



public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPrecio() {
	return precio;
}

public void setPrecio(String precio) {
	this.precio = precio;
}

public String getCantidad() {
	return cantidad;
}

public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}

public static int getNum_art() {
	return num_art;
}

public static void setNum_art(int num_art) {
	Archivos.num_art = num_art;
}

}



