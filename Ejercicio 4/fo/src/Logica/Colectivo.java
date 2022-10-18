package Logica;

public class Colectivo extends Motor {
	private String patente, tarifa, capacidad;

	public Colectivo(String numero_M, boolean estado, String patente, String tarifa, String capacidad) {
		super(numero_M, estado);
		this.patente = patente;
		this.tarifa = tarifa;
		this.capacidad = capacidad;
	}

	public String getPatente() {
		return patente;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String tarifa_pago(int val) {
		String aux;
		switch (val) {
		case 1:
			aux = "28";
			break;
		case 2:
			aux = "29.5";
			break;
		case 3:
			aux = "30.7";
			break;
		case 4:
			aux = "34";
			break;
		case 5:
			aux = "150";
			break;
		case 6:
			aux = "0.5";
			break;
		default:
			aux = "0";
			break;
		}
		return aux;
	}

}
