package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private int porcentajeDescuento;
	
	/**public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado) {
		super(nombre,precio,esCuidado);
	}*/
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado, int porcentajeDescuento) {
		super(nombre,precio,esCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public double getPrecio(){
		return precio - this.getDescuento();
	}
	
	private double getDescuento() {
		return (precio * porcentajeDescuento) / 100;
	}

}
