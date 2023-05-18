/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author aluno
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Forma forma = new Circulo();
        forma.desenhar();
        forma = new Quadrado();
        forma.desenhar();
        
        Circulo c = new Circulo();
        c.desenhar(1);

    }
}
