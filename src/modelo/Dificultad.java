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
	
	public int[][] getSudoku(int pId, boolean sol) {
		boolean enc = false;
		int i = 0;
		while (i < lSudokus.size() && !enc) {
			if (lSudokus.get(i).getId() == pId) enc = true;
			i++;
		}
		
		if (enc && sol) {
			return lSudokus.get(--i).getSol();
		} else if (enc && !sol) {
			return lSudokus.get(--i).getSudoku();
		} else return null;
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
