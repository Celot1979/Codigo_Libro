package Registro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import Registro.Registro;
import Guardar.Archivos;

public class Escribir {
	public Escribir(Archivos a) {
		 try {
	            ruta = "/Volumes/NO NAME/Pruebas_Programas/prueba.txt";
	            String contenido = "La clave es :" +a.getClave() + "\n" + "Nombre: " + a.getNombre() + "\n" + "Precio " + a.getPrecio() + "\n" + "Cantidad: " + a.getCantidad()+ "\n";
	            File file = new File(ruta);
	            // Si el archivo no existe es creado
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file,true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(contenido);
	            bw.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	}
		
		
	}
	
	private String ruta;
	private File archivo;
}
