/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinary;

import java.io.*;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Starter {
    private PrintStream print;
    private Scanner read;
    private Scanner read_pets_file;
    private File pets=new File("pets.txt");
    private File pets_out=new File ("pets_out.txt");
    private ArrayList <Person> people;
    public static void main(String[] args)   {
       try{
        Starter s1=new Starter();
        //Lectura
        File pets = new File ("pets.txt");    
        Vet v1=new Vet();
        try{
        s1.readPets(v1);
        }catch(InputMismatchException ex2){
           System.out.println("File Error");
            System.exit(0); 
        }catch(ArithmeticException ex3){
            System.out.println("The archive is incomplete");
            System.exit(0);
        }catch(IllegalArgumentException ex1){
            System.out.println("Repeated ID in the file");
            System.exit(0);
        }
        //Menu
        while(1>0){        
        System.out.println("Welcome to the veterinary");
        System.out.println("Select between the next options:");
        System.out.println("A.Remove a pet");
        System.out.println("B.List pets by their type");
        System.out.println("C.List all the pets");
        try{
        String option=s1.read.next();
        if(option.equals("A")||option.equals("B")||option.equals("C")){
        s1.manageVet(v1,option);
        s1.getRead_pets_file().reset();
        }else{
            throw new java.util.InputMismatchException();
        }
        }catch(java.util.InputMismatchException ex){
            System.out.println("Incorrect option------------------------------------------------");
        }
        }
        
 
    }catch(FileNotFoundException ex){
            System.out.println("Pets file not found");    
        }
    }
    public Starter() throws FileNotFoundException {
        this.read = new Scanner (System.in);
        this.read_pets_file = new Scanner (this.pets);
        this.people = new ArrayList <Person>();
        this.print= new PrintStream(this.pets_out);
    }

    public PrintStream getPrint() {
        return print;
    }
    public Scanner getRead_pets_file() {
        return read_pets_file;
    }

    
    public void readPets(Vet v) throws InputMismatchException,IllegalArgumentException, FileNotFoundException{
        
        boolean repeated_person=false;
        int num_file_lines=this.count_Lines();
        if((num_file_lines%2)==0){
            for(int i=0;i<num_file_lines;i++){
                if(this.read_pets_file.hasNext()){
            switch(this.read_pets_file.next()){
                case "Dog":
                    String key_d=this.read_pets_file.next();
                    Pet dog=new Dog(key_d,this.read_pets_file.next(),this.read_pets_file.next(),this.read_pets_file.next());
                    v.getPets().put(key_d,dog);
                    Person persond=new Person(this.read_pets_file.next(),this.read_pets_file.next());
        for(Person person1:this.people){
            if(persond.getId().equals(person1.getId())){
                person1.getPets().add(dog);
                repeated_person=true;
                break;
            }
        }
        if(!repeated_person==true){
            persond.getPets().add(dog);
            this.people.add(persond);
        }
        repeated_person=false;
                    break;
                case "Cat":
                    String key_c=this.read_pets_file.next();
                    Pet cat=new Cat(key_c,this.read_pets_file.next(),this.read_pets_file.next(),this.read_pets_file.nextBoolean());
                    v.getPets().put(key_c,cat);
                    Person personc=new Person(this.read_pets_file.next(),this.read_pets_file.next());
        for(Person person1:this.people){
            if(personc.getId().equals(person1.getId())){
                person1.getPets().add(cat);
                repeated_person=true;
                break;
            }
        }
        if(!repeated_person==true){
            personc.getPets().add(cat);
            this.people.add(personc);
        }
              repeated_person=false;      
                    break;
                case "Hamster":
                    String key_h=this.read_pets_file.next();
                    Pet hamster=new Hamster(key_h,this.read_pets_file.next(),this.read_pets_file.next(),this.read_pets_file.next());
                    v.getPets().put(key_h,hamster);
                    Person personh=new Person(this.read_pets_file.next(),this.read_pets_file.next());
        for(Person person1:this.people){
            if(personh.getId().equals(person1.getId())){
                person1.getPets().add(hamster);
                repeated_person=true;
                break;
            }
        }
        if(!repeated_person==true){
            personh.getPets().add(hamster);
            this.people.add(personh);
        }
        repeated_person=false;
                    break;
        }
                }
            }
            if(v.getPets().size()<(num_file_lines/2)){

               throw new java.lang.IllegalArgumentException();
            }
            }else{
        throw new java.lang.ArithmeticException();
        }
        
    }
    public void manageVet(Vet v, String action) {
        switch(action){
            case "A":
                try{
                System.out.println("Insert pet's ID:");
                String id=this.read.next();
                v.removePet(id);
                this.rewrite_txt(v);
                }catch(IOException ex1){
                    System.out.println("Pets file doesn't exist");
                    System.exit(0);
                }catch(ClassCastException|NullPointerException ex2){
                    System.out.println("Incorrect ID");
                    System.exit(0);
                }
                break;
            case "B":
                System.out.println("Insert the wished pet(Dog, Cat,Hamster)");
                try{
                v.showPetsByType(this.read.next());
                }catch(IllegalArgumentException ex){
                    System.out.println("Incorrect pet type");
                }
                break;
            case "C":
                v.showPets();
                break;
        }
    }
    public void rewrite_txt(Vet v) throws IOException {
        this.pets_out.delete();
        this.pets_out.createNewFile();
           for (Pet pet: v.getPets().values()){
               pet.printInfo(this.print);
               this.print.flush();
               for(Person person: this.people){
               for(int j=0;j<person.getPets().size();j++){
               if(person.getPets().get(j).equals(pet)){
                   this.print.print(person.getName()+" ");
                   this.print.println(person.getId()+" ");
                   this.print.flush();
                   break;
               }
               }               
           }
    }
           
    }
    public int count_Lines() throws FileNotFoundException{
        Scanner number_lines=new Scanner (this.pets);
        int num_file_lines=0;
        while(number_lines.hasNextLine()){
            String i=number_lines.nextLine();
            num_file_lines++;
        }
        return num_file_lines;
    }
}
