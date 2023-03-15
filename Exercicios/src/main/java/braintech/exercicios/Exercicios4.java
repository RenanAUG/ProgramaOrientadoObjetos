/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.exercicios;

/**
 *
 * @author aluno
 */
public class Exercicios4 {
    
    public static void main(String[] args){
        int[] primos = new int[20];
        int cont = 0;
        int num =2;
        
        while (cont < 20){
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    primo = false;
                    break;
            }
        }
        if(primo) {
            primos[cont] = num;
            cont++;
        }    
        num ++;
        }
    }
}
