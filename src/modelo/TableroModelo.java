package modelo;

import java.util.ArrayList;
import java.util.Iterator;
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
				int[] orgs = this.getOrigenes(i,j);
				if (val == 0) {
					tablero[i][j] = new CasillaModelo(false, val, i, j, orgs[0], orgs[1]);
					
				} else {
					tablero[i][j] = new CasillaModelo(true, val,i,j, orgs[0], orgs[1]);
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
	
	private int[] getOrigenes(int x, int y) {
		int[] orgs = new int[2];
		if (x == 0 || x == 1 || x == 2) {
			if (y == 0 || y == 1 || y == 2) {
				orgs[0] = 0;
				orgs[1] = 0;
			} else if (y == 3 || y == 4 || y == 5) {
				orgs[0] = 0;
				orgs[1] = 3;
			} else {
				orgs[0] = 0;
				orgs[1] = 6;
			}
		} else if (x == 3 || x == 4 || x == 5) {
			if (y == 0 || y == 1 || y == 2) {
				orgs[0] = 3;
				orgs[1] = 0;
			} else if (y == 3 || y == 4 || y == 5) {
				orgs[0] = 3;
				orgs[1] = 3;
			} else {
				orgs[0] = 3;
				orgs[1] = 6;
			}
		} else {
			if (y == 0 || y == 1 || y == 2) {
				orgs[0] = 6;
				orgs[1] = 0;
			} else if (y == 3 || y == 4 || y == 5) {
				orgs[0] = 6;
				orgs[1] = 3;
			} else {
				orgs[0] = 6;
				orgs[1] = 6;
			}
		}
		return orgs;
	}
	
	public void calcularCandidatos(int x, int y) {
		ArrayList<Integer> candidatos = new ArrayList<Integer>();
		ArrayList<Integer> valores = new ArrayList<Integer>();
		if (tablero[x][y].getValor() == 0) {
			//Valores de la fila
			for (int i = 0; i < tablero.length; i++) {
				int val = tablero[x][i].getValor();
				if (val != 0) valores.add(val); 
			}
			//Valores de la columna
			for (int i = 0; i < tablero.length; i++) {
				int val = tablero[i][y].getValor();
				if (val != 0) valores.add(val); 
			}
			//Valores del sector
			int[] orgs = tablero[x][y].getOrgs();
			int i = orgs[0];
			int iMax = i +3;
			while (i < iMax) {
				int j = orgs[1];
				int jMax = j +3;
				while (j < jMax) {
					int val = tablero[i][j].getValor();
					if (val != 0) valores.add(val);
					j++;
				}
				i++;
			}
			valores = eliminarRepetidos(valores);
			int j = 1;
			while (j < 10) {
				candidatos.add(j);
				j++;
			}
			int k = 0;
			boolean empty = false;
			while (k < valores.size() && !empty) {
				int a = 0;
				while (a < candidatos.size() && !empty) {
					if (valores.get(k) == candidatos.get(a)) {
						candidatos.remove(a);
						valores.remove(k);
						if (valores.isEmpty()) empty = true;
						k = -1;
						break;
					}
					a++;
				}
				k++;
			}
			
			tablero[x][y].setCandidatos(candidatos);
			
		}
	}
	
	private ArrayList<Integer> eliminarRepetidos(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if (a.get(i) == a.get(j) && i != j) a.remove(j);
			}
		}
		return a;
	}
	
	public void setCandidatos(String s, int x, int y) {
		ArrayList<Integer> a = new ArrayList<>();
		if (s!= null) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)!= ',' && s.charAt(i)!= '/' && s.charAt(i)!= '-' && s.charAt(i) != ' ') {
					a.add(Integer.parseInt(s.substring(i,i+1)));
				}
			}
			this.tablero[x][y].setCandidatos(a);
		} else {
			this.tablero[x][y].setCandidatos(null);
		}
		ArrayList<ArrayList<Integer>> b = new ArrayList<>();
		b.add(a);
		ArrayList<Integer> coords = new ArrayList<>();
		coords.add(x);
		coords.add(y);
		b.add(coords);
		this.setChanged();
		this.notifyObservers(b);
	}
}
