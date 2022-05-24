package model;

public class Registro {
private String cuenta, nombre,contra,email,clave;
private int control, control_clave;

public Registro(String clave,String cuenta, String nombre, String contra, String email) {
	super();
	this.clave = clave;
	this.cuenta = cuenta;
	this.nombre = nombre;
	this.contra = contra;
	this.email = email;
}


public Registro(String clave, String cuenta) {
	super();
	this.clave = clave;
	this.cuenta = cuenta;
	
}


public boolean metodo() {
	
	if(clave != " " && cuenta != " " && nombre != "" && contra !=" "  && email != " ") {
		control_clave = Integer.parseInt (clave);
		Base_Datos n_registro = new Base_Datos();
		n_registro.prueba();
		n_registro.resgistrar(control_clave, cuenta, nombre, contra, email);
		return false;
	}else {
		return true;
	}
	
	
}

public boolean borrar(String clave, String cuenta) {
	if(clave != "" && cuenta != " ") {
		Base_Datos n_borrar = new Base_Datos();
		n_borrar.prueba();
		n_borrar.borrar(cuenta, clave);
		System.out.println("Ha llegado hasta archivo java, método borrar");
	}
	return false;
	
}

public String getCuenta() {
	return cuenta;
}

public void setCuenta(String cuenta) {
	this.cuenta = cuenta;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getContra() {
	return contra;
}

public void setContra(String contra) {
	this.contra = contra;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}


}
