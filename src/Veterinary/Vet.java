/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinary;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Vet {
    private ArrayList <Pet> pets;

    public Vet() {
        this.pets = new ArrayList<>();
    }
    public void removePet(Pet p){
        
    }
    public void showPetsByType(String type) throws ClassNotFoundException{
        Class.
        for(int i=0;i<this.pets.size();i++){
        if(this.pets.get(i) instanceof type){
            
        }
    }
    }
    public void showPets(){
        for(int i=0;i<this.pets.size();i++){
           System.out.println("Pet"+" "+(i+1)+"------------------------------------------------");
           System.out.println("Name:"+this.pets.get(i).getName());
           System.out.println("ID:"+this.pets.get(i).getId());
           System.out.println("Hair Color:"+this.pets.get(i).getHairColor());
       }
    } 
}
