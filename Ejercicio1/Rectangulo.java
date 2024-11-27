package Taller11.Ejercicio1;

public class Rectangulo extends Figura { 
    private double ancho; 
    private double alto; 

    // Constructor 
    public Rectangulo(double ancho, double alto) { 
        this.ancho = ancho; this.alto = alto; } 

        // Implementación del método calcularArea 
        @Override 
        public double calcularArea() { 
            return ancho * alto;
         }
         
        // Métodos para obtener y establecer el ancho y el alto 
        public double getAncho() { 
            return ancho; 
        }
        
        public void setAncho(double ancho) { 
            this.ancho = ancho; 
        }

        public double getAlto() {
             return alto; 
            } 

        public void setAlto(double alto) { 
            this.alto = alto;
         } 
    }
