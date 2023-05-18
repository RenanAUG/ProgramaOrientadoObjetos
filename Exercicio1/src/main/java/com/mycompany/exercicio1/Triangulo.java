package com.mycompany.exercicio1;


import com.mycompany.exercicio1.Triangulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Triangulo extends Shape {
    
    public int base;
    public int altura;
    public int lados;

    public Triangulo(int base, int altura, int lados, double comprimento, int raio) {
        super(comprimento, raio);
        this.base = base;
        this.altura = altura;
        this.lados = lados;
    }
    
    @Override
    public void calcularArea() {
        
        double area = (base * altura)/2;
        
        System.out.println(area);
        
    }
    
    @Override
    public void calcularPerimetro() {        
        
        double perimetro = lados * 3;
        
        System.out.println(perimetro);
    }
    
}
