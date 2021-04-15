package modelo;

import java.util.ArrayList;

public class CasillaModelo {
	private boolean fijo;
	private int numero;
	private ArrayList<Integer> posiblesValores;
	private int coordenadaX;
	private int coordenadaY;
	
	public CasillaModelo(boolean pFijo, int pNumero, int pX, int pY) {
		fijo = pFijo;
		numero = pNumero;
		coordenadaX = pX;
		coordenadaY = pY;		
	}
	
	public void setValor(int i) {
		this.numero = i;
	}
	
	public int getValor() {
		return numero;
	}
	
}
