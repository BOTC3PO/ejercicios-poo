package fo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int Delegado=0;
		boolean rand[]= {true,false};
		String nombre[] = new String[10];
		Colectivo colectivo =new Colectivo(null, false, null, null, null);		
		Conductor conductor = new Conductor(false);
		if (conductor.isPersona()) {
			
		Delegado=(int)(Math.random()*40);
		do {
			int aux=(int) (Math.random()*2);
			Pasajero pasajero = new Pasajero((Math.random()*1201-200),"6981 2133 4905 1233",String.valueOf(10000000+Math.random()*99999999),nombre[(int)(Math.random()*10)],rand[aux] );
			Delegado++;
		} while (Delegado==60);
		JOptionPane.showMessageDialog(null, "lleno");
		}
	}

	
	
	
	
}
