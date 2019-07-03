/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Starter {
    public static void main(String[] args) {
        //Lectura
        File pets = new File ("pets.txt");
        Scanner read_pets =new Scanner ("pets.txt");
        
        //Menu
        while(1>0){
        Scanner read=new Scanner(System.in);
        System.out.println("Welcome to the veterinary");
        System.out.println("Select between the next options:");
        System.out.println("1.Remove a pet");
        System.out.println("2.List pets by their type");
        System.out.println("3.List all the pets");
        try{
        int option=read.nextInt();
        }catch(java.util.InputMismatchException ex){
            System.out.println("Incorrect option------------------------------------------------");
        }
        }
    }
    public void readPets(){
        
    }
    public void manageVet(){
        
    }
}
