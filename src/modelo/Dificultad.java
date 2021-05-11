package modelo;

import java.util.ArrayList;

public class Dificultad {
	private int dificultad;
	private ArrayList<Sudoku> lSudokus;
	
	public Dificultad(int d) {
		dificultad = d;
		lSudokus = new ArrayList<>();
	}
	
	public int getDificultad() {
		return dificultad;
	}
	
	public int[][] getSol(int pId) {
		boolean enc = false;
		int i = 0;
		while (i < lSudokus.size() && !enc) {
			if (lSudokus.get(i).getId() == pId) enc = true;
			i++;
		}
		
		if (enc) return lSudokus.get(--i).getSol();
		else return null;
	}
	
	public int[][] getSudoku() {
		int i = 0;
		boolean enc = false;
		int[][] tablero = null;
		while (i < lSudokus.size() && !enc) {
			tablero = lSudokus.get(i).getSudoku();
			if (tablero != null) enc = true;
			i++;
		}
		return tablero;
	}
	
	public void setSudoku(Sudoku s) {
		lSudokus.add(s);
	}
	
	public void setRealizado(int id) {
		int i = 0;
		boolean enc = false;
		while (i < lSudokus.size() && !enc) {
			if (lSudokus.get(i).getId() == id) {
				lSudokus.get(i).setRealizado();
				enc = true;
			}
			i++;
		}
	}
}
