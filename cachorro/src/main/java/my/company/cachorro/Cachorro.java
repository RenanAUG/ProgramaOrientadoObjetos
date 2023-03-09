/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my.company.cachorro;

/**
 *
 * @author aluno
 */
public class Cachorro {

    public int qtpatas;
    public String corDeOlhos;
    public String cor;
    public int idade;
    public double peso;
    public int tamanho;
    public String nome;
        
        public void latir(){
            if(tamanho > 60)
                System.out.print("Woof, Woof!");
             else if (tamanho > 14) 
                System.out.println("Ruff!, Ruff!");
            else 
                System.out.println("Yip!, Yip!");
    }
   
}

