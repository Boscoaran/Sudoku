package modelo;

public class Iniciador {
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		Iniciador i = new Iniciador();
		i.menu();
		
	}
	
	public Iniciador() {}
	
	public void menu() {
		new vista.VentanaInicio(null,false);
	}
	
}
