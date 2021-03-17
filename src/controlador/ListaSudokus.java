package controlador;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaSudokus {
	private ArrayList<Casilla[][]> lSudokus;
	
	public ListaSudokus() {
		try {
			Scanner entrada = new Scanner (new FileReader("sudoku.txt"));
			String val;
			while (entrada.hasNext()) {
				val = entrada.nextLine();
				if (val.length() == 9) {
					int l = 1;
					while (l<9) {
						for (int i = 0; i < val.length(); i++) {
							if 
						}
					}
				}
			}
			entrada.close();
		} catch (IOException e) {e.printStackTrace();}
	}
}
