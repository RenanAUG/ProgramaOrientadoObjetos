/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author aluno
 */
public class construtorCachorro {
     private String nomeCachorro;
    
    public construtorCachorro(String nome){
        nomeCachorro = nome;
    }
    
    public String getNome(){
        return "Nome do Cachorro " + nomeCachorro;
    }
}
