package ar.edu.unq.po2.tp5;

public class ProductoEmpresa extends Producto{

	public ProductoEmpresa(double precio, int stock) {
		super(precio, stock);
	}
	public double precioFinal() {
		return getPrecio();
	}

}
