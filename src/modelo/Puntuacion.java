package modelo;

public class Puntuacion {
	private String name;
	private int idSudoku;
	private int dif;
	private double puntuacion;
	
	public Puntuacion(String pNombre, int pIdSudoku, int pDif, double pPuntuacion) {
		name = pNombre;
		idSudoku = pIdSudoku;
		dif = pDif;
		puntuacion = pPuntuacion;
	}
	
	public double getPuntuacion() {
		return puntuacion;
	}
	
	public String getNombre() {
		return name;
	}
}
