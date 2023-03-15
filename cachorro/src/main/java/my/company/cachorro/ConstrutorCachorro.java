/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.cachorro;

/**
 *
 * @author aluno
 */
public class ConstrutorCachorro {
    
    private String nomeAnimal;
    private String corAnimal;
    private int idadeAnimal;
    private int qntPatasAnimal;
    private int pesoAnimal;
    
    public ConstrutorCachorro(String nome, String cor, int idade, int qntpatas, int peso){
        nomeAnimal = nome;
        corAnimal = cor;
        idadeAnimal = idade;
        qntPatasAnimal = qntpatas;
        pesoAnimal = peso;
    }
    
    public String getNome(){
        return "Nome do Animal: "+ nomeAnimal;
    }
    
    public String getCor(){
        return "Cor do Animal: "+ corAnimal;
    }
    
    public String getIdade(){
        return "Idade do Animal: "+ idadeAnimal;
    }

    public String getQntPatas(){
        return "Quantas patas do Animal: "+ qntPatasAnimal;
    }
    
    public String getPeso(){
        return "O peso do Animal: "+ pesoAnimal;
    }
    
}
