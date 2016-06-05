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
public class Retangulo extends FiguraGeometrica {
    protected double base, altura;

    public Retangulo(String nome, double base, double altura) {
        super.nome = nome;
        this.base = base;
        this.altura = altura;    
    }
    
    @Override
    public double calcularArea() {
        return ((base*altura)/2);
    }
    
}
