package Taller11.Ejercicio1;

public abstract class Figura { 
    // Método abstracto para calcular el área 
    public abstract double calcularArea(); 
    // Método para mostrar el área 
    public void mostrarArea() { 
        System.out.println("El área es: " + calcularArea()); 
    }
}