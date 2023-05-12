/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosoverride;

/**
 *
 * @author Renan
 */
public class ExerciciosOverride {

    public static void main(String[] args) {
       Animal animal = new Animal();
       animal.emitirSom();
       animal.mover();
       
       Cachorro cachorro = new Cachorro();
       cachorro.emitirSom();
       cachorro.mover();
       
       Gato gato = new Gato();
       gato.emitirSom();
       gato.mover();
    }
}
