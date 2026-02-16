//Amber Edmond
//CPSC 1302
//Module 3 Assignment 1
//This program houses the main method that uses the Pet class to store and print information about pets.

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Create Pet object with the default constructor
        Pet p1 = new Pet();
        //Print the object state
        System.out.println(p1);

        //Create Pet object with the custom constructor
        Pet p2 = new Pet("Lola", "Cat", 4);
        //Print the object state
        System.out.println(p2);

        //Get user input for the name, type, and age for another Pet object
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter animal type: ");
        String type = scanner.nextLine();
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.println("Enter animal age: ");
        int age = scanner.nextInt();
        //Create Pet object with the custom constructor and user input
        Pet p3 = new Pet(name, type, age);
        //Print the object state
        System.out.println(p3);
    }
}
