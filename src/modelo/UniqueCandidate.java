package modelo;

import java.util.ArrayList;

public class UniqueCandidate extends Ayuda{

	@Override
	public boolean darAyuda(CasillaModelo[][] tablero) {
		boolean completed = false;
		boolean enc = false;
		int vuelta = 0;
		int i = 0;
		int j = 0;
		int index = 0;
		while (vuelta < 9 && !enc) {
			CasillaModelo c;
			if (vuelta == 0) c = tablero[0][0];
			else if (vuelta == 1) c = tablero[0][3];
			else if (vuelta == 2) c = tablero[0][6];
			else if (vuelta == 3) c = tablero[3][0];
			else if (vuelta == 4) c = tablero[3][3];
			else if (vuelta == 5) c = tablero[3][6];
			else if (vuelta == 6) c = tablero[6][0];
			else if (vuelta == 7) c = tablero[6][3];
			else c = tablero[6][6];
			
			boolean lista[] = new boolean[10];
			int[] orgs = c.getOrgs();
			i = orgs[0];
			int iMax = i+3;
			while (i < iMax && !enc) {
				j = orgs[1];
				int jMax = j+3;
				while (j < jMax && !enc) {
					
					ArrayList<Integer> a = tablero[i][j].getCandidatosSistema();
					if (a != null) {
						boolean repetido = true;
						index = 0;
						while (index < a.size() && repetido) {
							if (!lista[tablero[i][j].getCandidatosSistema().get(index)]) {
								if (recorrerCandidatos(tablero,orgs[0],orgs[1],i,j,iMax,jMax,tablero[i][j].getCandidatosSistema().get(index))) {
									lista[tablero[i][j].getCandidatosSistema().get(index)]= true;
								} else {
									repetido = false;
									enc = true;
								}
							}
							index++;
						}
					}
					
					j++;
				}
				i++;
			}
			vuelta++;
		}
		if (enc) {
			completed = true;
			String[] st = new String[4];
			st[0] = "Estrategia";
			st[1] = "Unique Candidate";
			st[2] = "Casilla(" + i + ", " + j + ")";
			st[3] = "Valor: " + tablero[--i][--j].getCandidatosSistema().get(--index);
			TableroModelo.getTablero().actualizarAyuda(st);
		}
		return completed;
	}
	
	private boolean recorrerCandidatos(CasillaModelo[][] tablero, int orgI, int orgJ, int i, int j, int iMax, int jMax, int candidato) {
		boolean repetido = false;
		while (orgI < iMax && !repetido) {
			int jN = orgJ;
			while (jN < jMax && !repetido) {
				if (jN == j && orgI == i) {}
				else {
					ArrayList<Integer> a = tablero[orgI][jN].getCandidatosSistema();
					if (a != null) {
						int k = 0;
						while (k < a.size() && !repetido) {
							if (a.get(k) == candidato) {
								repetido = true;
							} else {
								k++;
							}
						}
					}
				}
				jN++;
			}
			orgI++;
		}
		return repetido;
	}
	
}
