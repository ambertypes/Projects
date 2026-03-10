//Amber Edmond
//Module 4 Assignment 1
//This program sets up the Calc class based on Runner.java. It performs math operations on two doubles.
public class Calc {
    //private data fields
    private double n1;
    private double n2;

    //Constructor
    public Calc() {
        n1 = 0;
        n2 = 0;
    }

    //set methods for data fields
    public void setNum1(double newN1) {
        this.n1 = newN1;
    }
    public void setNum2(double newN2) {
        this.n2 = newN2;
    }

    //get methods for data fields
    public double getNum1() {
        return n1;
    }
    public double getNum2() {
        return n2;
    }

    //toString method to output object status
    public String toString() {
        return "Displaying private data fields using toString():\nNum 1: "
                + n1 + "\nNum 2: " + n2;
    }

    //addition, subtraction, multiplication, division methods
    public double add() {
        return n1 + n2;
    }
    public double subtract() {
        return n1 - n2;
    }
    public double multiply() {
        return n1 * n2;
    }
    public double divide() {
        return n1 / n2;
    }
}

