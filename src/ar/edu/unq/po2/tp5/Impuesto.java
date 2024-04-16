package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	protected double tasaDeServicio;
	
	public double precioFinal() {
		return this.tasaDeServicio;
	}

	public Impuesto(double tasaDeServicio) {
		super();
		this.tasaDeServicio = tasaDeServicio;
	}

}
