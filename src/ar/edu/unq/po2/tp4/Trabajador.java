package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();

    public Trabajador() {
        ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }

    public double getTotalPercibido() {
        double total = 0;
        for (Ingreso ingreso : ingresos) {
            total += ingreso.getMonto();
        }
        return total;
    }

    public double getMontoImponible() {
        double montoImponible = 0;
        for (Ingreso ingreso : ingresos) {
            montoImponible += ingreso.getMontoImponible();
        }
        return montoImponible;
    }

    public double getImpuestoAPagar() {
        return getMontoImponible() * 0.02; // Impuesto al trabajador es el 2% del monto imponible
    }
}
	

