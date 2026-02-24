//Tests.java
//Amber Edmond
//CPSC 1302
//Module 3 Assignment 2
//This program sets up the Tests class, which calculates and stores averages of test scores based on user input.

import java.util.Scanner;

public class Tests {
    //private data fields
    private double ave;
    private int count;
    private int score;

    //public Constructor
    public Tests() {
        this.setScore(0);
    }

    //public set method for every private data field score only, ave and count are read-only
    public void setScore(int newScore) {
        this.score = newScore;
    }

    //public get method for every private date field
    public double getAve() {
        return this.ave;
    }
    public int getCount() {
        return this.count;
    }
    public int getScore() {
        return this.score;
    }

    //public getAverage method prompts the user for test scores and calculates the average
    public void getAverage() {
        //Prep for user input
        Scanner scan = new Scanner(System.in);
        double localSum = 0.0d;
        int localCount = 0;

        //Prompt user input
        System.out.println("Enter a test score or -1 to quit");
        int localScore = scan.nextInt();

        //Continue asking user for input until they enter -1
        while (localScore != -1) {
            //Add each score entered to the sum variable and increment the count variable
            localSum += localScore;
            localCount++;
            System.out.println("Enter a test score or -1 to quit");
            localScore = scan.nextInt();
        }
        //Calculate the average by diving the score sum by count and assign to the private ave variable
        this.ave = localSum / localCount;
        //Assign the count to the private count variable
        this.count = localCount;
    }

    //public toString method that formats the test average to 2 decimals
    public String toString() {
        return String.format("%.2f", this.ave);
    }
}