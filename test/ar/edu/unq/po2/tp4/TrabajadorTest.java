package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	
	private Ingreso ingresoMarzo;
	private Ingreso ingresoAbril;
	private IngresoPorHorasExtras ingresoMayo;
	private Trabajador tilin;
	
	@BeforeEach
	public void setUp() {
		ingresoMarzo = new Ingreso("marzo", "m", 100);
		ingresoAbril = new Ingreso("abril", "a",100);
		ingresoMayo = new IngresoPorHorasExtras("mayo", "m", 120,10);
		tilin = new Trabajador();
	}
	
	@Test
	public void testIngresoTotal() {
		tilin.agregarIngreso(ingresoMarzo);
		tilin.agregarIngreso(ingresoAbril);
		assertEquals(200, tilin.getTotalPercibido());
	}
	
	@Test
	public void testConMontoImponible() {
		tilin.agregarIngreso(ingresoMarzo);
		tilin.agregarIngreso(ingresoAbril);
		tilin.agregarIngreso(ingresoMayo);
		assertEquals(200, tilin.getMontoImponible());
	}
}
