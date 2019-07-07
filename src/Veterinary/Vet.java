/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinary;

import java.util.*;
import java.io.*;
/**
 *
 * @author Estudiante
 */
public class Vet {
    private HashMap <String,Pet> pets;


    public Vet()  {
        this.pets = new HashMap <>();
    }


    public HashMap<String, Pet> getPets() {
        return pets;
    }
    

    public void removePet(String id){
        this.pets.remove(id);
    }
    public void showPetsByType(String type) throws IllegalArgumentException {
        for(Pet pet: this.pets.values()){
           switch(type){
               case "Dog":
                   if(pet instanceof Dog){
                       pet.showInfo();
                   }
                   break;
                   case "Hamster":
                   if(pet instanceof Hamster){
                       pet.showInfo();
                   }
                   break;
                   case "Cat":
                   if(pet instanceof Cat){
                       pet.showInfo();
                   }
                   break;
                   default:
                       throw new java.lang.IllegalArgumentException();
    }
    }
    }
    public void showPets(){
       for(Pet pet:this.pets.values()){
           pet.showInfo();
       }
    } 
}
