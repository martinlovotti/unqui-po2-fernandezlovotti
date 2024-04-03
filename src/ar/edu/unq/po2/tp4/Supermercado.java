package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogo = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		return catalogo.size();
	}

	public void agregarProducto(Producto product) {
		catalogo.add(product);
	}

	public double getPrecioTotal() {
		double total = 0;
		for(Producto p:catalogo) {
			total += p.getPrecio();
		}
		return total;
	}
	
}
