/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author PC6
 */
public class Rectangulo {
    
     private double ancho;
     private double altura;
     

    public Rectangulo() {
        this.ancho = 1.00d;
        this.altura = 1.00d;
    }

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public double getArea(){
        return ancho * altura;
    }
    
     public double getPerimetro(){
        return (ancho + altura) * 2;
    }
    
    public static void main(String [] args){
        Rectangulo recta = new Rectangulo(4.00d,40.00d);
        System.out.println("EL AREA DE UN RECTANGULO ES: "+recta.getArea());
        System.out.println("EL PERIMETRO DE UN RECTANGULO ES: "+recta.getPerimetro());
        System.out.println();
        Rectangulo recta1 = new Rectangulo(3.5d,35.9d);
       System.out.println("EL AREA DE UN RECTANGULO ES: "+recta1.getArea());
        System.out.println("EL PERIMETRO DE UN RECTANGULO ES: "+recta1.getPerimetro());
    }
}
