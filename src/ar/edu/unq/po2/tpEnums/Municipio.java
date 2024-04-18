package ar.edu.unq.po2.tpEnums;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Municipio {
	
	private List<ActividadSemanal> actividades;
	
	
	public List<ActividadSemanal> actividadesDeFutbol(){
		return actividades.stream()
		.filter(act -> act.getDeporte() == Deporte.FUTBOL).toList();
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad){
		return actividades.stream().filter(a -> a.getComplejidad() == complejidad).toList();
	}
	
	public int cantidadDeHoras() {
		Stream<ActividadSemanal> stream = actividades.stream();
		return stream.mapToInt(a -> a.getDuracion()).sum();
	}
	
	//public ActividadSemanal actividadMenorCosto(Deporte actividad) {
		//return actividades.stream()
			//.min(Comparator.comparingInt(ActividadSemanal::coste));
	//}
	
}
