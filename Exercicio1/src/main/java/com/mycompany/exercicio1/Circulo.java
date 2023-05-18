/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class Circulo extends Shape{
    
    double pi = 3.14;

    public Circulo(double comprimento, int raio) {
        super(comprimento, raio);
    }
    
    public void calcularArea() {
        
        double area = pi * (raio * raio);
        
        System.out.println(area);
    }
    
    public void calcularPerimetro() {
        
        double comprimento = 2 * pi * this.raio;
        
        System.out.println(comprimento);
    }
    
}
