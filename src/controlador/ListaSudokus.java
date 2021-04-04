package controlador;

import java.util.ArrayList;


public class ListaSudokus {
	private ArrayList<ArrayList<int[][]>> lSudokus;
	private ArrayList<ArrayList<int[][]>> lSoluciones;
	private static ListaSudokus miListaSudokus;
	
	public ListaSudokus() {}
	
	public static ListaSudokus getListaSudokus() {
		if (miListaSudokus == null) miListaSudokus = new ListaSudokus();
		return miListaSudokus;
	}
	
	public int[][] getLSoluciones(int pos) {
		return lSoluciones.get(pos).get(0);
	}
	
	public int[][] getLSudokus(int pos) {
		return lSudokus.get(pos).get(0);
	}
	
	public void obtenerListas() {
		ArrayList<ArrayList<ArrayList<int[][]>>> l = CargadorTableros.getCargadorTableros().cargarTableros();
		lSudokus = l.get(0);
		lSoluciones = l.get(1);
	}
}

 