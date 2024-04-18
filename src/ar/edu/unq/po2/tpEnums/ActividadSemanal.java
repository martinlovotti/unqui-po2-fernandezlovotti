package ar.edu.unq.po2.tpEnums;

public class ActividadSemanal {
	private DiaDeLaSemana dia;
	private int hora;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int hora, int duracion, Deporte deporte){
		this.dia = dia;
		this.hora = hora;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}
	
	public int getComplejidad() {
		return deporte.getComplejidad();
	}

	public int getHora() {
		return hora;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public int coste() {
        int coste = 0;
        if (dia == DiaDeLaSemana.LUNES || dia == DiaDeLaSemana.MARTES || dia == DiaDeLaSemana.MIERCOLES) {
            coste = 500 + 200 * deporte.getComplejidad();
        } else {
            coste = 1000 + 200 * deporte.getComplejidad();
        }
        return coste;
    }
}
