//Runner.java
//Amber Edmond
//CPSC 1302
//Module 3 Assignment 2
//This program houses the main method that uses the Test class to calculate
// an average test score based on user input.

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Create Test object with constructor
        Tests scores1 = new Tests();

        //Call the public method getAverage() to calculate test score average based on user input
        scores1.getAverage();

        //Call toString() to display the formatted average
        System.out.println("The average of the " + scores1.getCount() + " scores entered is "
                + scores1.toString() + ".");
    }
}
