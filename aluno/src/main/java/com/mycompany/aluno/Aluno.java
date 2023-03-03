/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Aluno {

    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
        
        char sexo;
        
        System.out.println("Informe o nome do aluno: ");
        String nome = ler.nextLine();
        
        System.out.println("Informe o sexo do aluno: ");
        sexo = ler.next().charAt(0);
        
         System.out.println("O nome do aluno é: " + nome + " e o seu sexo é " + sexo);
        
        if (sexo == 'm'){
           System.out.println("Seu sexo é Masculino");
        } else if (sexo == 'f') {
           System.out.println("Seu sexo é Feminino");
        } else {
           System.out.println("Seu sexo é Programador");
       }
    }
}
