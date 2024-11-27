package Taller11.Ejercicio2;

public class Vendedor extends Empleado {
    private double comision;
    private int ventas;

    // Constructor
    public Vendedor(String nombre, double salarioBase, double comision, int ventas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventas = ventas;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (comision * ventas);
    }

    // Métodos getters y setters para comisión y ventas
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}

