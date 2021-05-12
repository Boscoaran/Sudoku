package modelo;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import static java.util.stream.Collectors.*;

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
				collect(groupingBy(Puntuacion::getNombre, 
						collectingAndThen(maxBy(comparingDouble(Puntuacion::getPuntuacion)),
								p-> p.get().getPuntuacion())));
		puntos = puntos.entrySet().stream().sorted(Map.Entry //ordenar la lista de mayor a menor puntuacion
				.comparingByValue(reverseOrder()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (antValor, nuevoValor) -> antValor, LinkedHashMap::new));
		
		Object[] a = puntos.entrySet().toArray();

		this.setChanged();
		this.notifyObservers(a);
	}
}
