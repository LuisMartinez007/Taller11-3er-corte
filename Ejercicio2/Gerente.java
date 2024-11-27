package Taller11.Ejercicio2;

public class Gerente extends Empleado {
    private double bonificacion;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonificacion;
    }

    // Método getter para la bonificación
    public double getBonificacion() {
        return bonificacion;
    }

    // Método setter para la bonificación
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
}
