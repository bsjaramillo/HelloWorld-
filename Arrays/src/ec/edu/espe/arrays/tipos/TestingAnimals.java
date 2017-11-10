/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arrays.tipos;

import ec.edu.espe.arrays.modelo.Animal;

/**
 *
 * @author BJ
 */
public class TestingAnimals {
    public static void main (String[] args){
        Animal[] animal;
        animal = new Animal[10];
        for (int i=0;i<animal.length;i++){
            
            animal[i]= new Animal();
            animal[i].setName("Mary");
            animal[i].setId(i+1);
            if (i%2 == 0){
                animal[i].setOjos("Black");
            }else{
                animal[i].setOjos("Brown");
            }
            
        }
        for (Animal animal1 : animal) {
            System.out.print("Chicken: " + animal1.getName() + + animal1.getId() + " Eyes: " + animal1.getOjos() + " ");
            System.out.println();
        }
        
    }
}
