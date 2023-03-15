/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.exercicios;

/**
 *
 * @author aluno
 */
public class Exercicios3 {
    
    public static void main(String[] args){
        int num1 = 20;
        long fatorial = 1;
        for (int i =1 ; i <=num1; i++){
            fatorial *=i;
        }
        System.out.println("Fatorial de "+ num1 + "é: " + fatorial);
    }
}
