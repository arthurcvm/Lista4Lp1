/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author arthurcvm
 */
public class Main {
    public static void main(String args[]){
        Triangulo triangulo = new Triangulo("triangulo", 13.4, 12.0);
        Retangulo retangulo = new Retangulo("retangulo",10,5);
        Circulo circulo = new Circulo("circulo",5);
        
        System.out.println("Area do circulo: "+circulo.calcularArea());
        System.out.println("Area do retangulo: "+retangulo.calcularArea());
        System.out.println("Area do triangulo: "+triangulo.calcularArea());
    } 
    
}
