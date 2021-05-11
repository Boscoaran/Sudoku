package modelo;

public class Iniciador {
	public static void main(String[] args) {
		Iniciador i = new Iniciador();
		i.menu();
		
	}
	
	public Iniciador() {}
	
	public void menu() {
		new vista.VentanaInicio(null);
	}
	
}
