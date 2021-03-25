package controlador;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Tablero extends Observable{
	private static Tablero miTablero = null;
	private Casilla tablero[][];
	private int tiempo;
	private int numAyudas;
	
	private Tablero() {
		tablero = new Casilla[9][9];
		tiempo = 0;
		numAyudas = 0;
	}
	
	public static Tablero getTablero() {
		if (miTablero == null) {
			miTablero = new Tablero();
		}
		return miTablero;
	}
	
	public void cargarTablero (int dif) {
		int[][] a = ListaSudokus.getListaSudokus().getLSudokus(dif);
		int i = 0;
		while (i< tablero.length) {
			int j = 0;
			while (j < tablero[0].length) {
				int val = a[i][j];
				if (val == 0) {
					tablero[i][j] = new Casilla(false, val, i, j);
					
				} else {
					tablero[i][j] = new Casilla(true, val,i,j);
				}
				j++;
			}
			i++;
		}
		this.setChanged();
		this.notifyObservers();
		
	}
	
	public Casilla[][] getListaCasillas() {
		return this.tablero;
	}
	
	public void setValor(int x, int y, String s) {
		if (!s.equals("")) {
			int n = Integer.parseInt(s);
			tablero[x][y].setValor(n);
		}
		
	}
	

}
