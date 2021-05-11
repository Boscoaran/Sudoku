package modelo;

public class Sudoku {
	private int id;
	private int[][] sudokuVacio;
	private int[][] sudokuSol;
	private boolean realizado;
	
	public Sudoku(int pId) {
		id = pId;
		realizado = false;
	}
	
	public int getId() {
		return id;
	}
	
	public int[][] getSol() {
		if (!realizado) return sudokuSol;
		return null;
	}
	
	public int[][] getSudoku() {
		if (!realizado) {
			TableroModelo.getTablero().setID(id);
			return sudokuVacio;
		}
		else return null;
	}
	
	public void setSudoku(int[][] pSud) {
		sudokuVacio = pSud;
	}
	
	public void setSolucion(int[][] pSol) {
		sudokuSol = pSol;
	}
	
	public void setRealizado() {
		realizado = true;
	}
}
