package modelo;

import java.util.ArrayList;

public class CasillaModelo {
	private boolean fijo;
	private int numero;
	private ArrayList<Integer> candidatosSistema;
	private ArrayList<Integer> candidatosUsuario;
	private boolean[] eliminados;
	private int coordenadaX;
	private int coordenadaY;
	private int oX;
	private int oY;
	
	public CasillaModelo(boolean pFijo, int pNumero, int pX, int pY, int pOX, int pOY) {
		eliminados = new boolean[10];
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
	
	public void setCandidatosSistema(ArrayList<Integer> pCandidatos) {
		candidatosSistema = pCandidatos;
	}
	
	public void setCandidatosUsuario(ArrayList<Integer> pCandidatos)  {
		candidatosUsuario = pCandidatos;
	}
	
	public ArrayList<Integer> getCandidatosSistema() {
		return candidatosSistema;
	}
	
	public ArrayList<Integer> getCandidatosUsuario() {
		return candidatosUsuario;
	}
	
}
