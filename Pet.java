//Amber Edmond
//CPSC 1302
//Module 2 Assignment 2
//This program creates a Pet class to store pet information and prints that information.

public class Pet {
    //private data fields
    private String name;

    //public Constructor(s)
    public Pet() {
        this.setName("");
    }

    //public set or mutator method for every private data field (except when the data field is read-only
    public void setName(String newName) {
        this.name = newName;
    }

    //public get or accessor method for every private date field (except if it is a secret)
    public String getName() {
        return this.name;
    }

    //public toString method that prints out all of the object state (meaning the data in the object instance
    // that you will later instantiate in the main() method
    public String toString() {
        String output = "Pet information: \nName: ";
        output += this.getName();
        return output;
    }

    //main
    public static void main(String[] args) {
        //Create Pet object
        Pet p1 = new Pet();
        //Print out object state
        System.out.println(p1);

        //Create Pet object
        Pet p2 = new Pet();
        //Set Pet name and use toString() method to print Pet name
        p2.setName("Lola");
        System.out.println(p2.toString());
    }
}