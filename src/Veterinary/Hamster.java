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
public class Hamster extends Pet{
    private String weight;

    public Hamster( String id, String name, String hairColor,String weight) {
        super(id, name, hairColor);
        this.weight = weight;
    }
    @Override
    public void sound() {
        System.out.println("");
    }
    
    @Override
    public void showInfo(){
           super.showInfo();
           System.out.println("Weight:"+this.weight);
           System.out.println("-------------------------------------------------");
    }
    @Override
    public void printInfo(PrintStream print){
        print.print("Hamster"+" ");
        super.printInfo(print);
        print.println(this.weight);
        
    }

    
    
}
