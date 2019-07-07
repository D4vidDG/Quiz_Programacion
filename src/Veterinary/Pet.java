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
public abstract class Pet {
   
    private String id;
    private String name;
    private String hairColor;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getHairColor() {
        return hairColor;
    }
    
    public void printInfo(PrintStream print){
        print.print(this.id+" ");
        print.print(this.name+" ");
        print.print(this.hairColor+" ");
        
    }
    public abstract void sound();
    public void showInfo(){
           System.out.println("Name:"+this.name);
           System.out.println("ID:"+this.id);
           System.out.println("Hair Color:"+this.hairColor);
    }

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }
    
   
}
