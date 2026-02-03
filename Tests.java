//Amber Edmond
//CPSC 1302
//Module 2 Assignment 1
//This program calculates and prints the average of three test scores.

public class Tests {
    public static void main(String[] args) {
        //Initialize test scores
        double score1 = 88.2d;
        double score2 = 78.9d;
        double score3 = 97.6d;
        //Average test scores and print the result
        double avg = (score1 + score2+ score3)/3;
        System.out.println("Test score 1: " + score1);
        System.out.println("Test score 2: " + score2);
        System.out.println("Test score 3: " + score3);
        System.out.println("The average of the three test scores is: " + avg);
    }
}
