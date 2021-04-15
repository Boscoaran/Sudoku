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
	
	public ArrayList<Dificultad> cargarTableros() {
		ArrayList<Dificultad> lSudokus = new ArrayList<Dificultad>();
	try {
		Scanner entrada = new Scanner (new FileReader("resources/sudoku.txt"));
		String val;
		int[][] a = null;
		int l = 0;
		int dif = 0;
		int id = 0;
		Dificultad d = null;
		Sudoku s = null;
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
				int i = 0;
				boolean enc = false;
				while (i < lSudokus.size() && !enc) {
					if (lSudokus.get(i).getDificultad() == dif) enc = true;
					i++;
				}
				if (enc) {
					d = lSudokus.get(--i);
				} else {
					d = new Dificultad(dif);
					lSudokus.add(d);
				}
				d.setSudoku(s);
			} else if (val.length() == 4) {
				id = val.charAt(3) - '0';
				s = new Sudoku(id);
			}
			if (l == 9) {
				if (s.getSudoku() == null && s.getSol() == null) {
					s.setSudoku(a);
				} else {
					s.setSolucion(a);
				}
				l = 0;
			}
		}
		entrada.close();
		} catch (IOException e) {e.printStackTrace();}
		return lSudokus;
	}
}
