package Logica;

public class Sube {
	private double credito;
	private String Numero;

	public Sube(double credito, String numero) {
		super();
		this.credito = credito;
		Numero = numero;
	}

	public double getCredito() {
		return credito;
	}

	public String getNumero() {
		return Numero;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	
	public String pagar(String val,Pasajero pasajero) {
		double aux=Double.parseDouble(val);
		double aux2=aux+(-120);
		String mensaje;
		if(pasajero.getCredito()>=aux2) {
			mensaje="pago realizado";
			pasajero.setCredito((pasajero.getCredito()-aux));
		}else {
			mensaje="error";
		}
		return mensaje;
	}
	
	
}
