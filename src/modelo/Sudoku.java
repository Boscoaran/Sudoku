package modelo;

public class Sudoku {
	private int id;
	private int[][] sudokuVacio;
	private int[][] sudokuSol;
	
	public Sudoku(int pId) {
		id = pId;
	}
	
	public int getId() {
		return id;
	}
	
	public int[][] getSol() {
		return sudokuSol;
	}
	
	public int[][] getSudoku() {
		return sudokuVacio;
	}
	
	public void setSudoku(int[][] pSud) {
		sudokuVacio = pSud;
	}
	
	public void setSolucion(int[][] pSol) {
		sudokuSol = pSol;
	}
}
