/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.exercicios;

/**
 *
 * @author aluno
 */
public class Exercicios2 {
    
    public static void main(String[] args){
        
        for(int i = 2; 1 <= 1000; i ++ ){
            boolean primo = true;
            for(int p =2; p <= Math.sqrt(i); p ++){
                if (i%p == 0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.println(i + "");
            }
           
        }
    }
    
}
