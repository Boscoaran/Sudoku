package controlador;

import java.util.Scanner;

import vista.Tablero;


public class Iniciador {
	public static void main(String[] args) {
		Iniciador i = new Iniciador();
		System.out.println("buenas tardes");
		i.menu();
		
	}
	
	public Iniciador() {}
	
	public void menu() {
		int i;
		do {
			Scanner s = new Scanner(System.in);
			i = s.nextInt();
		
			switch (i) {
				case 1: {
					ListaSudokus.getListaSudokus();
					int[][] a = ListaSudokus.getListaSudokus().getLSudokus(0);
					controlador.Tablero t = controlador.Tablero.getTablero();
					System.out.println(a[0][0]);
					vista.Tablero v = new vista.Tablero();
					System.out.println("hola");
					t.cargarTablero(1);
					System.out.println("hola");
				}
			}
		} while (i!=0);
	}
	
}
