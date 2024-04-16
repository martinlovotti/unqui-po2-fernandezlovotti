package ar.edu.unq.po2.tp5;

public abstract class Producto implements Pagable {
	protected double precio;
	protected int stock;
	
	public Producto(double precio, int stock) {
		this.precio = precio;
		setStock(stock);
	}
	
	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		setStock(getStock()-1);
	}
	
	public boolean hayStock() {
		return this.getStock() > 0;
	}
	
	public abstract double precioFinal();
	
	public void registrarEnCaja(Caja caja) {
		if(this.hayStock()) {
			caja.incrementarMontoAPagar(this.precioFinal());
			this.decrementarStock();
		}
		else {
			System.out.println("Producto sin stock disponible");
		}
	}
	
	
}
