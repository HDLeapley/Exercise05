package com.leapley.Week5;

import java.util.Scanner;

/*
Create a class that represents contact information for a person.
The class should store the person's name and their email address.
Create a second class that represents an address book (a collection
of contact information for many people) that includes methods for
adding new contact information and for searching the existing collection
for a contacts email address when the name is specified. The program should
create instances of the classes and demonstrate the functionality.
 */
public class Main {

    static void displayMenu(){ //Display menu choices
        System.out.println("--------------\n" +
                "What would you like to do? \n" +
                "(1) Add Person \n" +
                "(2) Find Email \n" +
                "(3) List Contacts \n" +
                "(4) Exit");
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook(); //Create address book
        Person per1 = new Person("Hudson","014327@swcsd.us"); //CREATING TWO RANDOM PEOPLE W/CONTACT INFO
        Person per2 = new Person("Ethan","random@gmail.net");
        book.addPerson(per1); //Add person1 in address book
        book.addPerson(per2); //Add person2 in address book
        Scanner scan = new Scanner(System.in);
        boolean runProgram = true;

        while(runProgram){
            displayMenu();
            String name;
            String email;
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1: //Add new person to address book.
                    System.out.println("What is the person's name?");
                    name = scan.nextLine();
                    System.out.println("What is the person's email?");
                    email = scan.nextLine();
                    Person newPerson = new Person(name,email);
                    book.addPerson(newPerson);
                    break;
                case 2: //Find email of said person
                    System.out.println("What is the person's name?");
                    name = scan.nextLine();
                    if (!book.getEmail(name).equals("")){
                        System.out.println(name + "'s email: " + book.getEmail(name));
                    }else{
                        System.out.println(name + " is not in the address book");
                    }
                    break;
                case 3: //List people
                    book.listPeople();
                    break;
                case 4: //Exit program
                    runProgram = false;
                    break;
            }
        }
    }
}
