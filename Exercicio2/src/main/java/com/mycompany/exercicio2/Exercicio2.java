/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        Double numero1 = ler.nextDouble();
        
        System.out.println("Informe um segundo número: ");
        Double numero2 = ler.nextDouble();
        
        Double total = (numero1 + numero2);
        
        System.out.println("A soma total dos números é: " + total);
    }
}
