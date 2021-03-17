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
	
	public Tablero getTablero() {
		if (miTablero == null) {
			miTablero = new Tablero();
		}
		return miTablero;
	}
	
	

}
