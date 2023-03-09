/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.cachorro;

/**
 *
 * @author aluno
 */
public class testeCachorro {
     
    public static void main(String[] args) {
    
        Cachorro teste = new Cachorro();        
        teste.cor = "preto";
        teste.qtpatas = 4;
        teste.corDeOlhos = "azul";
        teste.idade = 12;
        teste.peso = 15.0;
        teste.tamanho = 1;
        teste.latir();
        
        Cachorro teste2 = new Cachorro();
        teste2.cor = "marrom";
        teste2.qtpatas = 4;
        teste2.corDeOlhos = "azul";
        teste2.idade = 5;
        teste2.peso = 5.4;
        teste2.tamanho = 4;
        teste2.latir();
        
        Cachorro teste3 = new Cachorro();
        teste3.cor = "branco";
        teste3.qtpatas = 3;
        teste3.corDeOlhos = "castanho";
        teste3.idade = 1;
        teste3.peso = 4.1;
        teste3.tamanho = 12;
        teste3.latir();
        
        Cachorro teste4 = new Cachorro();
        teste4.cor = "amarelo";
        teste4.qtpatas = 3;
        teste4.corDeOlhos = "preto";
        teste4.idade = 3;
        teste4.peso = 20.0;
        teste4.tamanho = 14;
        teste4.latir();

        Cachorro teste5 = new Cachorro();
        teste5.cor = "rosa";
        teste5.qtpatas = 4;
        teste5.corDeOlhos = "verde";
        teste5.idade = 6;
        teste5.peso = 5.00;
        teste5.tamanho = 65;
        teste5.latir();
        
//        Cachorro cac = new Cachorro();
//        cac.tamanho = 1;
        
        
             
    }
}
