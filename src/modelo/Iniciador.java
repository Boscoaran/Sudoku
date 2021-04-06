package modelo;



public class Iniciador {
	public static void main(String[] args) {
		Iniciador i = new Iniciador();
		i.menu();
		
	}
	
	public Iniciador() {}
	
	public void menu() {
		//int i;
		vista.VentanaInicio v = new vista.VentanaInicio();
		/*do {
			Scanner s = new Scanner(System.in);
			i = s.nextInt();
			i = 1;
			
			switch (i) {
				case 1: {
					
					
					ListaSudokus.getListaSudokus();
					int[][] a = ListaSudokus.getListaSudokus().getLSudokus(0);
					controlador.Tablero t = controlador.Tablero.getTablero();
					System.out.println(a[0][0]);
					vista.Tablero v = new vista.Tablero();
					System.out.println("hola");
					t.cargarTablero(1);
					System.out.println("hola");
				}
			}
		} while (i!=0);*/
	}
	
}
