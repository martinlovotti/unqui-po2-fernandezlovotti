package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
    private int horasExtras;

    public IngresoPorHorasExtras(String mes, String concepto, double monto, int horasExtras) {
        super(mes, concepto, monto);
        this.horasExtras = horasExtras;
    }

    @Override
    public double getMontoImponible() {
        return 0; // Las horas extras están exentas de impuestos
    }
}
