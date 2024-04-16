package ar.edu.unq.po2.tp5;

public abstract class Factura implements Pagable{
	
	public void registrarEnCaja(Caja caja) {
		caja.incrementarMontoAPagar(this.precioFinal());
	}
	
	public abstract double precioFinal();
	 
}
