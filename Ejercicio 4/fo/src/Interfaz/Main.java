package Interfaz;

import javax.swing.JOptionPane;

import Logica.Colectivo;
import Logica.Conductor;
import Logica.Pasajero;

public class Main {

	public static void main(String[] args) {
		int Delegado = 0;
		String auxi;
		boolean rand[] = { true, false };
		String nombre[] = new String[10];
		Colectivo colectivo = new Colectivo(null, false, null, null, null);
		Conductor conductor = new Conductor(true);
		if (conductor.isPersona()) {

			Delegado = (int) (Math.random() * 40);
			int aux = (int) (Math.random() * 2);
			Pasajero pasajero = new Pasajero((Math.random() * 1201 - 200), "6981 2133 4905 1233",
					String.valueOf(10000000 + Math.random() * 99999999), nombre[(int) (Math.random() * 10)], rand[aux]);
			
			System.out.println(pasajero.getCredito());
			auxi=pasajero.pagar(colectivo.tarifa_pago((int)(Math.random()*7)), pasajero);
			System.out.println(pasajero.getCredito());
			JOptionPane.showMessageDialog(null,auxi);
			Delegado++;
			JOptionPane.showMessageDialog(null, "lleno");
		}
	}

}
