package modelo;

public class Usuario {
	private int id;
	private String nombreUsuario;
	private double mejorPuntuacion;
	
	public Usuario(int pId, String pNombre, double punt) {
		id = pId;
		nombreUsuario = pNombre;
		mejorPuntuacion = punt;
	}
	
	public String getName() {
		return nombreUsuario;
	}
	
	public int getId() {
		return id;
	}
}
