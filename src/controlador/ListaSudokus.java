package controlador;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class ListaSudokus {
	private ArrayList<int[][]> lSudokus;
	private ArrayList<int[][]> lSoluciones;
	private static ListaSudokus miListaSudokus;
	
	public ListaSudokus() { //No se si sería recomendable hacer un método exclusivo para la carga
		lSudokus = new ArrayList<int[][]>();
		lSoluciones = new ArrayList<int[][]>();
	try {
		Scanner entrada = new Scanner (new FileReader("sudoku.txt"));
		String val;
		int[][] a = null;
		int l = 0;
		while (entrada.hasNext()) {
			val = entrada.nextLine();
			if (val.length() == 9) {
				a = new int[9][9];
				int i = 0;
				while (i<a.length) {
					l = 0;
					while ( l< a[0].length) {
						int v = Integer.parseInt(String.valueOf(val.charAt(l)));
						a[i][l] = v;
						l ++;
					}
					i++;
					if (i!=9) val = entrada.nextLine();
				}
			}
			if (l == 9) {
				if (lSudokus.size() == lSoluciones.size())
					lSudokus.add(a);
				else
					lSoluciones.add(a);
				l = 0;
			}
				
			
		}
		entrada.close();
	} catch (IOException e) {e.printStackTrace();}
}
	
	public static ListaSudokus getListaSudokus() {
		if (miListaSudokus == null) miListaSudokus = new ListaSudokus();
		return miListaSudokus;
	}
	
	public int[][] getLSudokus(int pos) {
		return lSudokus.get(pos);
	}
}
