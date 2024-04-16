package ar.edu.unq.po2.tp5;

public class Caja {
	private double totalAPagar;
	
	public Caja(Agencia agencia) {
		this.totalAPagar = (0.00f);
	}
	
	public double getTotalAPagar() {
		return this.totalAPagar;
	}

	public void registrarPagable(Pagable pagable) {
		pagable.registrarEnCaja(this);
	}
	
	public void incrementarMontoAPagar(double precio) {
		this.totalAPagar = this.getTotalAPagar()+precio;
	}

}
