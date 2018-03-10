
package Practicas;


public class Shape {
    public static final int CUADRADO = 1;
    public static final int CIRCULO = 2;
    public static final int TRIANGULO = 3;
    
    private int forma;
    private double tamanio;
    public Shape(int shapeType, double size){
        this.forma = shapeType;
        this.tamanio = size;
    }
    
    public double area(){
        switch (forma){
            case CUADRADO: return tamanio*tamanio;
            case CIRCULO: return Math.PI*tamanio*tamanio/4.0;
            case TRIANGULO: return tamanio*tamanio/2.0;
        }
        return 0;
    }
}