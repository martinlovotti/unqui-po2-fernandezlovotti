package ar.edu.unq.po2.tpEnums;

public enum Color {
	ROJO("Inflamación Aguda", 4, "Gris"), 
	GRIS("Necrosis", 3, "Amarillo"), 
	AMARILLO("Presencia de Pus", 2, "Miel"), 
	MIEL("Curacion", 1, "Rojo");
	
	private String descripcion;
	private int nivelRiesgo;
	private String siguienteColor;
	
	private Color(String descripcion, int nivelRiesgo, String siguienteColor){
		this.descripcion = descripcion;
		this.nivelRiesgo = nivelRiesgo;
		this.siguienteColor = siguienteColor;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getNivelRiesgo() {
		return nivelRiesgo;
	}

	public String getSiguienteColor() {
		return siguienteColor;
	 }
}
