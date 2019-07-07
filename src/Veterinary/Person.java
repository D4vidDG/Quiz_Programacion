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
public class Person {
    private String name;
    private String id;
    private ArrayList <Pet> pets;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
        this.pets = new ArrayList <>();
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public ArrayList<Pet> getPets() {
        return pets;
    }
    
    public void showPets(){
       for(int i=0;i<this.pets.size();i++){
           System.out.println("Pet"+" "+(i+1)+"------------------------------------------------");
           pets.get(i).showInfo();
       }
    }
    }
    
    
    

