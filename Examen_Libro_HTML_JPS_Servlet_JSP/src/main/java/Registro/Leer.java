package Registro;

import java.io.*;
import java.util.ArrayList;

import Guardar.Archivos;
public class Leer {
  private static  int cont = 0;
  private static File archivo;
  private static FileReader fr;
  private static BufferedReader br;
  static ArrayList <Archivos> productos =new ArrayList<Archivos>();
public static ArrayList < Archivos > leeProductos(){
	
	try {
		archivo = new File("/Volumes/NO NAME/Pruebas_Programas/prueba.txt");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		String linea=null;
		String [] tokensLinea = null;
		String clave;
		String nombre;
		String precio;
		String cant;
		Archivos producto;
		linea=br.readLine();
		while( linea!=null){
		    tokensLinea = linea.split(",");
		    clave= tokensLinea[0];
		    nombre =tokensLinea[1];
		    precio= tokensLinea[2];
		    cant =tokensLinea[3];
		    producto = new Archivos(clave,nombre, precio, cant);
		    productos.add(producto);
		    cont++;
		    linea=br.readLine();
		} 
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally{
		
	}
	
	return productos;

}
public static int getCont(){
    return cont;
}
 public static void clearCont(){
	 cont=0; 
 }
}