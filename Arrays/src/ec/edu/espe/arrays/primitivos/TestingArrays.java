/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arrays.primitivos;

/**
 *
 * @author BJ
 */
public class TestingArrays {

    public static void main(String[] args) {
        int[] enteros = new int[10];
        float[] flotantes = new float[5];

        for (int i = 0; i <enteros.length; i++) {
            enteros[i] = i + 1;
        }
        for (int i=0;i<flotantes.length;i++) {
             flotantes[i]=1+(float)(i+1)/10;
        }

        for (int entero: enteros){
            System.out.print(entero + ",");
        }
        System.out.println();
                
        for (float flotante: flotantes){
            System.out.print(flotante + ",");
        }
        
    }
}
