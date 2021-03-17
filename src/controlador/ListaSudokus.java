package controlador;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class ListaSudokus {
	private ArrayList<int[][]> lSudokus;
	private ArrayList<int[][]> lSoluciones;
	
	public ListaSudokus() {
		try {
			Scanner entrada = new Scanner (new FileReader("sudoku.txt"));
			String val;
			int[][] a = null;
			int l = 0;
			while (entrada.hasNext()) {
				val = entrada.nextLine();
				if (val.length() == 9) {
						a = new int[9][9];
						for (int i = 0; i < val.length(); i++) {
							a[l][i] = val.charAt(i);
							if (l < 9) {
								lSudokus.add(a);
							} else if (l > 17) {
								l = 0;
							} else {
								lSoluciones.add(a);
							}
						}
					l++;
				}
			}
			entrada.close();
		} catch (IOException e) {e.printStackTrace();}
	}
}
