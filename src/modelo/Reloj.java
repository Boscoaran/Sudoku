package modelo;

public class Reloj extends Thread{
	private int  hora = 0, min = 0, seg = 0;
	
	public void run() {
		try {
			while (TableroModelo.estaOn()) {
				Thread.sleep(1000);
				seg++;
				if (seg == 60) {
					min++;
					if (min == 60) {
						hora++;
						if (hora == 100) {
							hora = 0;
							min = 0;
							seg = 0;
						}
					}
				}
				String t = textConv(hora)+":"+textConv(min)+":"+textConv(seg);
				TableroModelo.getTablero().setTiempo(t);
				
			}
		} catch (Exception e) {
			System.out.println("Exception en el hilo : "+e.getMessage());
		}
	}
	
	public String textConv(int i) {
		if (i < 10) {
			return  "0"+i;
		} else {
			return i+"";
		}
	}
}