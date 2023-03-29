/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Listas {

    public static void main(String[] args) {
        
        String curso1 = "Estrutura de dados";
        String curso2 = "Robótica";
        String curso3 = "Inteligencia Artificial";
        String curso4 = "Java";
        
        int cursoint1 = 2;
        int cursoint2 = 5;
        int cursoint3 = 4;
        int cursoint4 = 1;
        
        ArrayList<String> cursos = new ArrayList<>();
        
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        ArrayList<Integer> cursos_int = new ArrayList<>();
        
        cursos_int.add(cursoint1);
        cursos_int.add(cursoint2);
        cursos_int.add(cursoint3);
        cursos_int.add(cursoint4);
        
        System.out.println(cursos);
        System.out.println(cursos_int);

    }
}
