/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author aluno
 */
public class Circulo extends Forma{
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando circulo.");
    }
    
    public void desenhar(int a){
        System.out.println("Desenhando circulo" + a);
    }
}
