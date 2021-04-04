package controlador;

import java.util.ArrayList;


public class ListaSudokus {
	private ArrayList<int[][]> lSudokus;
	private ArrayList<int[][]> lSoluciones;
	private static ListaSudokus miListaSudokus;
	
	public ListaSudokus() {}
	
	public static ListaSudokus getListaSudokus() {
		if (miListaSudokus == null) miListaSudokus = new ListaSudokus();
		return miListaSudokus;
	}
	
	public int[][] getLSoluciones(int pos) {
		return lSoluciones.get(pos);
	}
	
	public int[][] getLSudokus(int pos) {
		return lSudokus.get(pos);
	}
	
	public void obtenerListas() {
		ArrayList<ArrayList<int[][]>> l = CargadorTableros.getCargadorTableros().cargarTableros();
		lSudokus = l.get(0);
		lSoluciones = l.get(1);
	}
}
