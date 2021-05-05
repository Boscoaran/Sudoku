package modelo;

import java.util.ArrayList;

public class CasillaModelo {
	private boolean fijo;
	private int numero;
	private ArrayList<Integer> posiblesValores;
	private int coordenadaX;
	private int coordenadaY;
	private int oX;
	private int oY;
	
	public CasillaModelo(boolean pFijo, int pNumero, int pX, int pY, int pOX, int pOY) {
		fijo = pFijo;
		numero = pNumero;
		coordenadaX = pX;
		coordenadaY = pY;	
		oX = pOX;
		oY = pOY;
	}
	
	public void setValor(int i) {
		this.numero = i;
	}
	
	public int getValor() {
		return numero;
	}
	
	public int[] getOrgs() {
		int[] orgs = {oX,oY};
		return orgs;
	}
	
	public void setCandidatos(ArrayList<Integer> pCandidatos) {
		posiblesValores = pCandidatos;
		
	}
	
	public ArrayList<Integer> getCandidatos() {
		return posiblesValores;
	}
	
}
