package controlador;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CargadorTableros {
	private static CargadorTableros miCargadorTableros;
	private CargadorTableros(){};
	
	public static CargadorTableros getCargadorTableros() {
		if (miCargadorTableros == null) {
			miCargadorTableros = new CargadorTableros();
		}
		return miCargadorTableros;
	}
	
	public ArrayList<ArrayList<int[][]>> cargarTableros() {
		ArrayList<ArrayList<int[][]>> res = new ArrayList<ArrayList<int[][]>>();
		ArrayList<int[][]> lSudokus = new ArrayList<int[][]>();
		ArrayList<int[][]> lSoluciones = new ArrayList<int[][]>();
	try {
		Scanner entrada = new Scanner (new FileReader("resources/sudoku.txt"));
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
			res.add(0,lSudokus);
			res.add(1,lSoluciones);
			
		}
		entrada.close();
		} catch (IOException e) {e.printStackTrace();}
	return res;
	}
}
