package list;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Productos productos = new Productos(0, "zinc");
		Productos productos2 = new Productos(1, "Hierro");
		Productos productos3 = new Productos(2, "wolframio");
		LinkedList<Productos> productos1 = new LinkedList<Productos>();
		productos1.add(productos);
		productos1.add(0, productos2);
		productos1.add(productos3);
		menu(productos1);
	}

	private static void menu(LinkedList<Productos> productos1) {
		String opcion;
		do {

			opcion = JOptionPane.showInputDialog(null);
			switch (opcion) {
			case "0":
				mostrar(productos1);
				break;
			case "1":
				anadir( productos1);
				break;
			case "2":
				 remover(productos1) ;
				break;
			default:
				break;
			}

		} while (opcion.charAt(0) == '4');
	}

	public static void mostrar(LinkedList<Productos> productos1) {

		if (productos1.isEmpty()) {

		} else {
			for (int i = 0; i < 3; i++) {
				System.out.println(productos1.get(i).getDom());
			}
		}

	}

	public static void anadir(LinkedList<Productos> productos1) {
		int r=0;
		do {
		 String	aux= JOptionPane.showInputDialog("ingrese nombre del producto");
		 
			if (r<=0) {
				Productos productosr = new Productos(r, aux);
				productos1.add(productosr);
			}
		} while (r!=-1);
	}
	
	
	public static void remover(LinkedList<Productos> productos1) {
		int s=1 , auxs;
		String sms;
		do {
			
			if (s<=0) {
				for (int i = 0; i < productos1.size(); i++) {
					sms=productos1.get(i).getDoc() + " " + productos1.get(i).getDom() + "\n";
				}
				s=Integer.parseInt(JOptionPane.showInputDialog("ingrese nombre del producto"));
				if (condition) {
					
				auxs=Integer.parseInt(JOptionPane.showInputDialog("ingrese el id"));
				productos1.remove(auxs);
			
				}
			}
		} while (s!=-1);
	}
	
}
