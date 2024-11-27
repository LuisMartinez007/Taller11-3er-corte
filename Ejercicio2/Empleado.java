package Taller11.Ejercicio2;

public abstract class Empleado {
    private String nombre;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

