package modelo;

public class GeneradorDeAyudas{
	private static GeneradorDeAyudas mGenerador;
	
	private GeneradorDeAyudas() {}
	public static GeneradorDeAyudas getGenerador() {
		if (mGenerador == null) mGenerador = new GeneradorDeAyudas();
		return mGenerador;
	}
	
	public Ayuda generarAyuda(String ayuda)  {
		if (ayuda.equals("Sole Candidate")) return new SoleCandidate();
		else if (ayuda.equals("Unique Candidate")) return new UniqueCandidate();
		else return null;
	}
}
