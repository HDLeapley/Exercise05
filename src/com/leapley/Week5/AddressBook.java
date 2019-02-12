package com.leapley.Week5;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person){
        people.add(person);
    }

    public String getEmail(String name){
        String email = "";
        for (Person person : people){
            if(person.getName().equalsIgnoreCase(name)){
                email = person.getEmail(); //Found that persons name email, set it equal to email
            }
        }
        return email; //Return email as string
    }
    public void listPeople(){
        for (Person person : people){
            System.out.println(person.getName());
        }
    }
}
