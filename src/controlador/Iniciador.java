package controlador;

import java.util.Scanner;

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
					int j = 0;
					while (j<a.length) {
						int k = 0;
						while (k<a[0].length) {
							System.out.println(a[j][k]);
							k++;
						}
						j++;
					}
				}
			}
		} while (i!=0);
	}
}
