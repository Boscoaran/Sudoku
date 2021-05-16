package modelo;

import java.util.ArrayList;

public class SoleCandidate extends Ayuda{
	public SoleCandidate(){}

	@Override
	public boolean darAyuda(CasillaModelo[][] tablero) {
		boolean completed = false;
		boolean enc = false;
		int i = 0;
		while (i < tablero.length && !enc) {
			int j = 0;
			while (j < tablero[0].length && !enc) {
				ArrayList<Integer> a = tablero[i][j].getCandidatosSistema();
				if (a != null && tablero[i][j].getCandidatosSistema().size() == 1) {
					completed = true;
					String[] st = new String[4];
					st[0] = "Estrategia";
					st[1] = "Sole Candidate";
					st[2] = "Casilla(" + ++i + ", " + ++j + ")";
					st[3] = "Valor: " + tablero[--i][--j].getCandidatosSistema().get(0);
					enc = true;
					TableroModelo.getTablero().actualizarAyuda(st);
				}
				j++;	
			}
			i++;
		}
		return completed;
		
	}

}
