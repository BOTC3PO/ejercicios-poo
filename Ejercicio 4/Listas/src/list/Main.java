package list;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Productos productos = new Productos(0, "zinc");
		Productos productos2 = new Productos(1, "Hierro");
		Productos productos3 = new Productos(2, "wolframio");
		LinkedList<Productos> productos1 = new LinkedList<Productos>();
		productos1.add(productos);
		productos1.add(productos2);
		productos1.add(productos3);
		menu(productos1);
	}

	@SuppressWarnings("static-access")
	private static void menu(LinkedList<Productos> productos1) {
		String listaordenada[] = { "1-mostrar productos", "2-añadir producto", "3-Borrar producto",
				"4-modificar producto", "5-buscar", "6-salir" };
		String opcion, auxil = null;
		char trifuerza;
		do {

			opcion = (String) JOptionPane.showInputDialog(null, "seleccion", "menu", JOptionPane.QUESTION_MESSAGE, null,
					listaordenada, listaordenada[0]);
			trifuerza = opcion.charAt(0);
			auxil = auxil.valueOf(trifuerza);
			opcion = opcion.valueOf((Integer.parseInt(auxil) - 1));

			switch (opcion) {
			case "0":
				mostrar(productos1);
				break;
			case "1":
				anadir(productos1);
				break;
			case "2":
				remover(productos1);
				break;
			case "3":
				reemplazardato(productos1);
				break;
			case "4":
				buscar(productos1);
				break;
			default:
				break;
			}

		} while (opcion.charAt(0) == '5');
	}

	public static void mostrar(LinkedList<Productos> productos1) {

		if (productos1.isEmpty()) {

		} else {
			for (int i = 0; i < productos1.size(); i++) {
				System.out.println(productos1.get(i).getDom());
			}
		}

	}

	public static void anadir(LinkedList<Productos> productos1) {
		int r = 0;
		do {
			String aux = JOptionPane.showInputDialog("ingrese nombre del producto");

			if (r <= 0) {
				Productos productosr = new Productos(r, aux);
				productos1.add(productosr);
			}
			r=Integer.parseInt(JOptionPane.showInputDialog("1-si\n-1-no","-1"));
		} while (r != -1);
	}

	public static void remover(LinkedList<Productos> productos1) {
		int s = 1, auxs;
		String sms = "";
		do {
			sms = "";
			if (true) {
				for (int i = 0; i < productos1.size(); i++) {
					sms += i + " " + productos1.get(i).getDom() + "\n";
				}
				s = Integer.parseInt(JOptionPane.showInputDialog(sms + "\ningrese el id"));
				if (productos1.size() != 0) {
					if (s > -1) {
						auxs = s;
						productos1.remove(auxs);
						if (productos1.size() == 0) {
							s = -1;
						}
					}
				} else {
					s = -1;
				}
			}
		} while (s != -1);
		menu(productos1);
	}

	public static void buscar(LinkedList<Productos> productos1) {
		String block = "1";
		String blockid[] = { "1-busqueda por nombre", "2-Busqueda por ID" };
		String opcion;
		opcion = (String) JOptionPane.showInputDialog(null, "seleccion", "menu", JOptionPane.QUESTION_MESSAGE, null,
				blockid, blockid[0]);
		block = JOptionPane.showInputDialog("ingrese el dato");
		int saseindex = -1;
		boolean definir = (opcion.charAt(0) == '2');

		int cout = 0;
		for (Productos productos : productos1) {
			System.out.println(productos);
			if (block != null) {
				if (definir) {
					if (productos.getDoc() == (Integer.parseInt(block))) {
						saseindex = cout;
					}
				} else {
					if (productos.getDom().equalsIgnoreCase(block)) {
						saseindex = cout;
					}
				}

			}

			cout++;
			System.out.println(cout);
		}

		if (saseindex != -1) {
			JOptionPane.showMessageDialog(null,
					"ID " + productos1.get(saseindex).getDoc() + "\nProducto " + productos1.get(saseindex).getDom());
		}

		menu(productos1);
	}

	public static void reemplazardato(LinkedList<Productos> productos1) {
		int tamaño=productos1.size()+1;
		String sms[] = new String[tamaño] ;
		String sms1[] = new String[tamaño] ;
		String del;
		int i=0;
		for (Productos productos : productos1) {
			sms [i]=productos.getDom();
			sms1[i]=Integer.toString(i);
			i++;
		}
		sms[i]="ninguno";
		del= (String) JOptionPane.showInputDialog(null, "borrar libro", "menu", JOptionPane.QUESTION_MESSAGE, null,
				sms, sms[0]);
		if (!del.equalsIgnoreCase("ninguno")) {
			
		} else {
			
		}
		
		menu(productos1);
	}

}
