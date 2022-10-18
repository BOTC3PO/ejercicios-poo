package fo;

public class Pasajero extends Sube {
 private String dni,nombre;
 private boolean sube;

public Pasajero(double credito, String numero, String dni, String nombre, boolean sube) {
	super(credito, numero);
	this.dni = dni;
	this.nombre = nombre;
	this.sube = sube;
}

public String getDni() {
	return dni;
}

public String getNombre() {
	return nombre;
}

public boolean getSube() {
	return sube;
}

public void setDni(String dni) {
	this.dni = dni;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setSube(boolean sube) {
	this.sube = sube;
}
 
 
 
}
