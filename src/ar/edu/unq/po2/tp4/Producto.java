package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado = false;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean esCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esCuidado;
	}
	
	public void aumentarPrecio(double aumento){
		this.setPrecio(this.getPrecio() + aumento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	

}
