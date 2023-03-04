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
        int numero1 = ler.nextInt();
        
        System.out.println("Informe um segundo número: ");
        int numero2 = ler.nextInt();
        
//        Double total = (numero1 + numero2);
        
//        System.out.println("A soma total dos números é: " + total);

        System.out.println("Informe até onde o for vai: ");
        int b = ler.nextInt();

        for (int a = 0; a < b; a++) {
            System.out.printf("Informe o %2dº, valor:", (a+1),b);
            System.out.println(a);
        }

        System.out.println("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n", numero1, numero2, (numero1 + numero2));
        System.out.printf("%d - %d = %3d\n", numero1, numero2, (numero1 - numero2));
        System.out.printf("%d * %d = %3d\n", numero1, numero2, (numero1 * numero2));
        System.out.printf("%d / %d = %3d(divisão inteira)\n", numero1, numero2, (numero1 / numero2));
        System.out.printf("%d / %d = %6.2f(dvisão exata)\n", numero1, numero2, ((double)numero1 / numero2));
    }
}
