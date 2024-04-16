package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	protected double costoPorUnidad;
	protected int cantidadDeUnidades;

	
	public double precioFinal() {
		return costoPorUnidad * cantidadDeUnidades;
	}

	public Servicio(double costoPorUnidad, int cantidadDeUnidades) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidades = cantidadDeUnidades;
	}

}
