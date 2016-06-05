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
public class Circulo extends FiguraGeometrica {
    protected double raio;

    public Circulo(String nome, double raio) {
        super.nome = nome;
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }
    
}
