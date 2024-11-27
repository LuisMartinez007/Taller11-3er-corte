package Taller11.Ejercicio3;

public class Gerente extends Empleado {
    // Intento de sobrescribir el método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 1000.0; // Implementación específica
    }
}

