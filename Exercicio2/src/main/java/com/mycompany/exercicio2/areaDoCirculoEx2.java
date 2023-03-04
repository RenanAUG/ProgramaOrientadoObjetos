/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class areaDoCirculoEx2 {
    
    public static void main(String[] args){
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o raio do círculo: ");
    Double raio = ler.nextDouble();
    
//    int pi = (22/7);

//    Double areaTotal = (raio * raio * pi);

    Double areaTotal = (22*raio*raio)/7;
            
    System.out.println("A área total do circulo em cm é: "+ areaTotal);
    System.out.println("A área total do circulo em metros é: " + (areaTotal/100));
    System.out.printf("%.2f", areaTotal);
    
    System.out.println("\n");
    
    System.out.print("A área do meu circulo é: ");
    System.out.printf("%04f", areaTotal);
    
    }
}
