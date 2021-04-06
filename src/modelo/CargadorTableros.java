package modelo;

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
	
	public ArrayList<ArrayList<ArrayList<int[][]>>> cargarTableros() {
		ArrayList<ArrayList<ArrayList<int[][]>>> res = new ArrayList<ArrayList<ArrayList<int[][]>>>(3); //Para devolver el resultado
		ArrayList<ArrayList<int[][]>> lSudokus = new ArrayList<ArrayList<int[][]>>(3);
		ArrayList<ArrayList<int[][]>> lSoluciones = new ArrayList<ArrayList<int[][]>>(3);
	try {
		Scanner entrada = new Scanner (new FileReader("resources/sudoku.txt"));
		String val;
		int[][] a = null;
		int l = 0;
		int dif = 0;
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
			} else if (val.length() == 1) {
				dif = Integer.parseInt(val);
				dif--; //la posición en el array es dif - 1
			}
			if (l == 9) {
				if (lSudokus.size() == lSoluciones.size()) {
					if (lSudokus.size() < 3) {
						ArrayList<int[][]> lista = new ArrayList<int[][]>();
						lSudokus.add(dif,lista);
					}
					lSudokus.get(dif).add(a);
				} else {
					if (lSoluciones.size() < 3) {
						ArrayList<int[][]> lista = new ArrayList<int[][]>();
						lSoluciones.add(dif,lista);
					}
					lSoluciones.get(dif).add(a);
				}
				l = 0;
			}
		}
		entrada.close();
		} catch (IOException e) {e.printStackTrace();}
	res.add(0,lSudokus);
	res.add(1,lSoluciones);
	return res;
	}
}
