/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinary;

import java.io.PrintStream;

/**
 *
 * @author Estudiante
 */
public class Dog extends Pet {
    private String breed;

    public Dog(String id, String name, String hairColor,String breed) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    
    @Override
    public void sound() {
        System.out.println("Guau");
    }
    @Override
    public void showInfo(){
           super.showInfo();
           System.out.println("Breed:"+this.breed);
            System.out.println("-------------------------------------------------");
    }
    public void printInfo(PrintStream print){
        print.print("Dog"+" ");
        super.printInfo(print);
        print.println(this.breed);
    }


   
    
}
