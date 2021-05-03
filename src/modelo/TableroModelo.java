package modelo;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class TableroModelo extends Observable{
	private static TableroModelo miTablero = null;
	private CasillaModelo tablero[][];
	private int h;
	private int m;
	private int s;
	private int numAyudas;
	private int dificultad;
	private static boolean estaOn;
	private String usuario;
	private double puntos;
	private int idSudoku;
	
	private TableroModelo() {
		tablero = new CasillaModelo[9][9];
		s = 0;
		m = 0;
		h = 0;
		numAyudas = 0;
		estaOn = true;
		iniciarReloj();
	}
	
	public int getDif() {
		return dificultad;
	}
	
	public int getId() {
		return idSudoku;
	}
	
	public static boolean estaOn() {
		return estaOn;
	}
	
	public static TableroModelo getTablero() {
		if (miTablero == null) {
			miTablero = new TableroModelo();
		}
		return miTablero;
	}
	
	public double getPuntos() {
		return puntos;
	}
	
	public String getUser() {
		return usuario;
	}
	
	private void calcularPuntos() {
		int segundos = h*3600 + m*60 + s;
		puntos = (30000 * dificultad/(segundos + (30*numAyudas)));
	}
	
	public void cargarTablero (int dif,String u) {
		usuario = u;
		ListaSudokus.getListaSudokus().obtenerListas();
		//PROVISIONAL//
		int pId;
		if (dif == 1) pId = 1;
		else if (dif == 2) pId = 3;
		else pId = 4;
		idSudoku = pId;
		//int[][] a = ListaSudokus.getListaSudokus().getLSudokus(pId, dif);
		int[][] a = ListaSudokus.getListaSudokus().getLSoluciones(pId, dif);
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
			calcularPuntos();
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
		ArrayList<Integer> candidatos= new ArrayList<Integer>();
		for (int aux=1; aux<10; aux++){
			candidatos.add(aux);
		}
		for (int i=1; i<9; i++) {
			int ind = candidatos.indexOf(tablero[i][y].getValor());
			if (ind!=-1){
				candidatos.remove(ind);
			}
		}
		for (int j=1; j<9; j++) {
			int ind = candidatos.indexOf(tablero[x][j].getValor());
			if (ind!=-1){
				candidatos.remove(ind);
			}
		}
		int[] orgs=tablero[x][y].getOrgs();
		int i = orgs[0];
		int iMax = i +3;
		while (i < iMax) {
			int j = orgs[1];
			int jMax = j +3;
			while (j < jMax) {
				int ind = candidatos.indexOf(tablero[i][j].getValor());
				if (ind!=-1){
					candidatos.remove(ind);
				}
				j++;
			}
			i++;
		}
		tablero[x][y].setCandidatos(candidatos);
		ArrayList<ArrayList<Integer>> b = new ArrayList<>();
		b.add(candidatos);
		ArrayList<Integer> coords = new ArrayList<>();
		coords.add(x);
		coords.add(y);
		b.add(coords);
		this.setChanged();
		this.notifyObservers(b);
	}
	
	public void calcularCandidatosGlobal() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j].getValor() == 0)
					calcularCandidatos(i, j);
			}
		}
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
	
	public void iniciarReloj() {
		Reloj r = new Reloj();
		r.start();
	}
	
	public void setTiempo(String t,int hora, int min, int seg) {
		h = hora;
		m = min;
		s = seg;
		this.setChanged();
		this.notifyObservers(t);
	}
}