package modelo;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class TableroModelo extends Observable{
	private static TableroModelo miTablero = null;
	private CasillaModelo tablero[][];
	private int tiempo;
	private int numAyudas;
	private int dificultad;
	
	private TableroModelo() {
		tablero = new CasillaModelo[9][9];
		tiempo = 0;
		numAyudas = 0;
	}
	
	public static TableroModelo getTablero() {
		if (miTablero == null) {
			miTablero = new TableroModelo();
		}
		return miTablero;
	}
	
	public void cargarTablero (int dif) {
		ListaSudokus.getListaSudokus().obtenerListas();
		//PROVISIONAL//
		int pId;
		if (dif == 1) pId = 1;
		else if (dif == 2) pId = 3;
		else pId = 4;
		int[][] a = ListaSudokus.getListaSudokus().getLSudokus(pId, dif);
		///////////////
		dificultad = dif;
		int i = 0;
		while (i< tablero.length) {
			int j = 0;
			while (j < tablero[0].length) {
				int val = a[i][j];
				if (val == 0) {
					tablero[i][j] = new CasillaModelo(false, val, i, j);
					
				} else {
					tablero[i][j] = new CasillaModelo(true, val,i,j);
				}
				j++;
			}
			i++;
		}
		int [] arg = {0};
		this.setChanged();
		this.notifyObservers(arg);
		
	}
	
	public CasillaModelo[][] getListaCasillas() {
		return this.tablero;
	}
	
	public void setValor(int x, int y, String s) {
		if (!s.equals("")) {
			int n = Integer.parseInt(s);
			tablero[x][y].setValor(n);
			int[] arg = {2,x,y,n};
			setChanged();
			notifyObservers(arg);
		}
		
	}
	
	public void comprobarResultado() {
		int[] arg = new int[2];
		arg[0] = 1; //identifica el proceso del resultado
		//PROVISIONAL//
		int pId;
		if (dificultad == 1) pId = 1;
		else if (dificultad == 2) pId = 3;
		else pId = 4;
		int[][] res = ListaSudokus.getListaSudokus().getLSoluciones(pId, dificultad);
		///////////////
		boolean correcto = true;
		int j, i;
		i = 0;
		while (i < res.length && correcto) {
			j = 0;
			while (j < res[0].length && correcto) {
				if (this.tablero[i][j].getValor() != res[i][j]) correcto = false;
				j++;
			}
			i++;
		}
		if (correcto) {
			arg[1] = 1;
		} else {
			arg[1] = 0;
		}
		this.setChanged();
		this.notifyObservers(arg);
	}
	
	public void calcularCandidatos(int x, int y) {
		ArrayList<Integer> candidatos = new ArrayList<Integer>();
		int pos = 0;
		for(int n=0; n<9; n++){
			candidatos.add(n+1);
		}
		for (int i=0; i<9; i++){
			if (candidatos.contains((tablero[i][y]).getValor())) {
				pos=candidatos.indexOf((tablero[i][y].getValor()));
				candidatos.remove(pos);
			}
		}
		for (int j=0; j<9; j++){
			if (candidatos.contains((tablero[x][j]).getValor())) {
				pos=candidatos.indexOf((tablero[x][j].getValor()));
				candidatos.remove(pos);
			}
		}
		int oX=0;
		int oY=0;
		if (x/3 <=1) {
			oX=1;
		}else if (x/3 <=2) {
			oX=4;
		}
		else if (x/3 <=3) {
			oX=7;
		}
		if (y/3 <=1) {
			oY=1;
		}else if (y/3 <=2) {
			oY=4;
		}
		else if (y/3 <=3) {
			oY=7;
		}
		for (int a=0; a<3; a++) {
			for (int b=0; b<3; b++) {
				if (candidatos.contains((tablero[oX+a][oY+b]).getValor())) {
					pos=candidatos.indexOf((tablero[oX+a][oY+b].getValor()));
					candidatos.remove(pos);
				}
			}
		}
	}
}
