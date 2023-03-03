/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author aluno
 */

public class PrimeiroProjeto {
   public static void main(String[] args){
       
       Scanner a = new Scanner(System.in);
       
       System.out.println("Informe um número: ");
       double valor = a.nextDouble();
       
       if(valor> 20){
           System.out.println("Hello World!");
       } else {
           System.out.println("Hello Unipar!");
       }
   }
}
