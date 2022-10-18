package Logica;

public class Motor {
  private String numero_M ;
  private boolean estado;
public Motor(String numero_M, boolean estado) {
	this.numero_M = numero_M;
	this.estado = estado;
}
public String getNumero_M() {
	return numero_M;
}
public boolean isEstado() {
	return estado;
}
public void setNumero_M(String numero_M) {
	this.numero_M = numero_M;
}
public void setEstado(boolean estado) {
	this.estado = estado;
}
  
}
