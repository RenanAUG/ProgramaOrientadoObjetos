/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Aula {

    public static void main(String[] args) {
        
        String[] vetorNomes = new String[5];
        
        vetorNomes[0] = "Juca";        
        vetorNomes[1] = "José";
        
        
        for (int i = 0; i < vetorNomes.length; i++) {
            String nome = JOptionPane.showInputDialog("Informe um nome: ");
            vetorNomes[i] = nome;
        }
        
        String msg = "Nome inseridos no vetor: \n";
        for (int i = 0; i < vetorNomes.length; i++) {
            msg += "Posição: ["+i+"] => "+vetorNomes [i]+ "\n";            
        }
        
        JOptionPane.showMessageDialog(null, msg);

    }
}
