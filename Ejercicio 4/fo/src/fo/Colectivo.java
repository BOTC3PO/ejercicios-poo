package fo;

public class Colectivo extends Motor {
	private String patente,tarifa,capacidad;

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
	
	
	
}
