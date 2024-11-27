package Taller11.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Gerente
        Gerente gerente = new Gerente("Ana López", 5000.00, 2000.00);
        gerente.mostrarDetalles();

        System.out.println("-------------------------");

        // Crear una instancia de Vendedor
        Vendedor vendedor = new Vendedor("Carlos Gómez", 3000.00, 500.00, 10);
        vendedor.mostrarDetalles();
    }
}

