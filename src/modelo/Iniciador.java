package modelo;



public class Iniciador {
	public static void main(String[] args) {
		Iniciador i = new Iniciador();
		i.menu();
		
	}
	
	public Iniciador() {}
	
	public void menu() {
		vista.VentanaInicio v = new vista.VentanaInicio();
	}
	
}
