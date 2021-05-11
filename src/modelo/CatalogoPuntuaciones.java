package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import java.util.stream.*;

@SuppressWarnings("deprecation")
public class CatalogoPuntuaciones extends Observable{
	private ArrayList<Puntuacion> lPuntuaciones;
	private static CatalogoPuntuaciones mPuntuaciones; 
	
	private CatalogoPuntuaciones() {
		lPuntuaciones = new ArrayList<>();
	}
	
	public static CatalogoPuntuaciones getCatalogoPuntuaciones() {
		if (mPuntuaciones == null) mPuntuaciones = new CatalogoPuntuaciones();
		return mPuntuaciones;
	}
	
	public void anadirPuntuacion(Puntuacion p) {
		lPuntuaciones.add(p);
	}
	
	public void puntuacionesMayores() {
		Map<String,Double> puntos;
		puntos = lPuntuaciones.stream(). //Sacar la lista de las mejores puntuaciones
				collect(Collectors.groupingBy(Puntuacion::getNombre, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Puntuacion::getPuntuacion)),
								p-> p.get().getPuntuacion())));
		puntos = puntos.entrySet().stream().sorted(Map.Entry //ordenar la lista de mayor a menor puntuacion
				.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (antValor, nuevoValor) -> antValor, LinkedHashMap::new));
		
		Object[] a = puntos.entrySet().toArray();

		this.setChanged();
		this.notifyObservers(a);
	}
}
