/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.cachorro;

/**
 *
 * @author aluno
 */
public class Construtor {
 
    public static void main(String[] args){
        ConstrutorCachorro animal = new ConstrutorCachorro("Pluto", "Azul", 5, 4, 10);
        ConstrutorCachorro animal1 = new ConstrutorCachorro("Bob", "Amarelo", 7, 2, 15);
        ConstrutorCachorro animal2 = new ConstrutorCachorro("Alex", "Marrom", 10, 3, 4);
        ConstrutorCachorro animal3 = new ConstrutorCachorro("Tatu", "Preto", 1, 4, 7);
        ConstrutorCachorro animal4 = new ConstrutorCachorro("Lucas", "Branco", 3, 3, 2);
        
        System.out.println(animal.getNome());
        System.out.println(animal.getCor());
        System.out.println(animal.getIdade());
        System.out.println(animal.getPeso());
        System.out.println(animal.getQntPatas());
        
        System.out.println("\n");
        
        System.out.println(animal1.getNome());
        System.out.println(animal1.getCor());
        System.out.println(animal1.getIdade());
        System.out.println(animal1.getPeso());
        System.out.println(animal1.getQntPatas());
        
        System.out.println("\n");
        
        System.out.println(animal3.getNome());
        System.out.println(animal3.getCor());
        System.out.println(animal3.getIdade());
        System.out.println(animal3.getPeso());
        System.out.println(animal3.getQntPatas());
        
        System.out.println("\n");
        
        System.out.println(animal4.getNome());
        System.out.println(animal4.getCor());
        System.out.println(animal4.getIdade());
        System.out.println(animal4.getPeso());
        System.out.println(animal4.getQntPatas());
        
        System.out.println("\n");
        
        System.out.println(animal2.getNome());
        System.out.println(animal2.getCor());
        System.out.println(animal2.getIdade());
        System.out.println(animal2.getPeso());
        System.out.println(animal2.getQntPatas());


    }
}
