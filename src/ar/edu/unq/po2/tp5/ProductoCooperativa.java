package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(double precio, int stock, String nombre) {
		super(precio, stock);
	}
	
	public double precioFinal() {
		return precio * 0.9;
	}
	
}

