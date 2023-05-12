/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosoverload;

/**
 *
 * @author Renan
 */
public class ExerciciosOverload {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int[] resultado = {4, 5, 9};
        
        System.out.println(calc.somar(5, 3));
        System.out.println(calc.somar(2.5, 2.5));
        System.out.println(calc.somar(resultado));
        
    }
}
