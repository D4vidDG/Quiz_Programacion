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
public class Cat extends Pet{
    private boolean isHunter;

    public Cat( String id, String name, String hairColor,boolean isHunter) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    @Override
    public void sound() {
        System.out.println("Miau");
    }
    @Override
    public void showInfo(){
           super.showInfo();
           System.out.println("¿Is it hunter?:"+this.isHunter);
            System.out.println("-------------------------------------------------");
           
    }
    @Override
        public void printInfo(PrintStream print){
        print.print("Cat"+" ");
        super.printInfo(print);
        print.println(this.isHunter);
    }
}

