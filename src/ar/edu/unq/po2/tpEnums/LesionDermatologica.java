package ar.edu.unq.po2.tpEnums;

public class LesionDermatologica {
	private Color color;

	public LesionDermatologica(Color color) {
		this.color = color;
	}
	
	public Color getLesion() {
		return color;
	}
	
	public String obtenerDescripcion(){
		return color.getDescripcion();
	}
	
	public void imprimirInformacion() {
        System.out.println("Descripción: " + color.getDescripcion());
        System.out.println("Siguiente Color: " + color.getSiguienteColor());
    }

}
