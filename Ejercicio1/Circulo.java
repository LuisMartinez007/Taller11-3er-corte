package Taller11.Ejercicio1;

public class Circulo extends Figura { 
    private double radio; 
    // Constructor 
    public Circulo(double radio) { 
        this.radio = radio; } 
        // Implementación del método calcularArea 
        @Override 
        public double calcularArea() { 
            return Math.PI * radio * radio; 
        } // Método para obtener el radio 
        public double getRadio() { 
            return radio; 
        } // Método para establecer el radio
         public void setRadio(double radio) { 
            this.radio = radio; 
        } 
    }
