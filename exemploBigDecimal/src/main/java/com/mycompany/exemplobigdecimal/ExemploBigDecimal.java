/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobigdecimal;

import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class ExemploBigDecimal {

    public static void main(String[] args) {
        
                        new FramePrincipal2().setVisible(true);

        
        
        
        //somar
        BigDecimal valor = new BigDecimal("1.0");
        BigDecimal valor2 = new BigDecimal("2.0");
        
        valor = valor.add(valor2);
        System.out.println("Soma:" + valor);
        
        //subtrair
        valor = valor.subtract(valor2);
        System.out.println("Subtrair: " + valor);
        
        //dividir
        valor = new BigDecimal("10");
        valor = valor.divide(valor2);
        System.out.println("Divisão: " + valor);
        
        
        //Multiplicar
        valor = new BigDecimal("2");
        valor = valor.multiply(valor2);
        System.out.println("Multiplicar: " + valor);
        
        //Compare
        //-1 = menor
        //0 = igual
        //1 = maior
        valor = new BigDecimal("2");
        int compara = valor.compareTo(valor2);
        System.out.println("Comparação: " + compara);
        
        
    }
}
