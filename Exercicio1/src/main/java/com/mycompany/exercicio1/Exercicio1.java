/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        //1 - Crie uma classe abstrata Shape com métodos abstratos calcularArea e calcularPerimetro. Implemente a subclasses Circulo, Retangulo, Triangulo que herdam de Shape e implementam
        // os métodos abstratos de forma polimórfica.
        
        Shape shape = new Shape(10, 5);
        
        Circulo circulo = new Circulo(shape.comprimento, shape.raio);
        
        Retangulo retangulo = new Retangulo(5, 10, shape.comprimento, shape.raio);
        
        Triangulo triangulo = new Triangulo(6, 10, 3, shape.comprimento, shape.raio);
        
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        
        circulo.calcularPerimetro();
        circulo.calcularArea();
    }
}
