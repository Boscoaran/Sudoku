package modelo;

import java.util.ArrayList;


public class ListaSudokus {
	private ArrayList<Dificultad> lSudokus;
	private static ListaSudokus miListaSudokus;
	private boolean cargado;
	
	private ListaSudokus() {
		cargado = false;
	}
	
	public static ListaSudokus getListaSudokus() {
		if (miListaSudokus == null) miListaSudokus = new ListaSudokus();
		return miListaSudokus;
	}
	
	public int[][] getLSoluciones(int id, int dif) {
		boolean enc = false;
		int i = 0;
		while (i < lSudokus.size() && !enc) {
			if (lSudokus.get(i).getDificultad() == dif) enc = true;
			i++;
		}
		if (enc) return lSudokus.get(--i).getSudoku(id, true);
		else return null;
	}
	
	public int[][] getLSudokus(int id, int dif) {
		boolean enc = false;
		int i = 0;
		while (i < lSudokus.size() && !enc) {
			if (lSudokus.get(i).getDificultad() == dif) enc = true;
			i++;
		}
		if (enc) return lSudokus.get(--i).getSudoku(id, false);
		else return null;
	}
	
	public void obtenerListas() {
		lSudokus = CargadorTableros.getCargadorTableros().cargarTableros();
		cargado = true;
	}
	
	public void setRealizado(int id, int dif) {
		int i = 0;
		boolean enc = false;
		while (i < lSudokus.size() && !enc) {
			if (lSudokus.get(i).getDificultad() == dif) {
				lSudokus.get(i).setRealizado(id);
				enc = true;
			}
			i++;
		}
	}
	
	public boolean estaCargado() {
		return cargado;
	}
}

 