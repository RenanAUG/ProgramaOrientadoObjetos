package com.mycompany.exercicio1;


import com.mycompany.exercicio1.Retangulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Retangulo extends Shape {
    
    public int base;
    public int altura;

    public Retangulo(int base, int altura, double comprimento, int raio) {
        super(comprimento, raio);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        double area = this.base * this.altura;
        
        System.out.println(area);
    }
    
    @Override
    public void calcularPerimetro() {
        
        double perimetro = 2*(this.base + this.altura);
        
        System.out.println(perimetro);
    }
}
