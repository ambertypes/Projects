//Amber Edmond
//CPSC 1302
//Module 3 Assignment 1
//This program creates a Pet class to store pet information and prints that information,
//adding onto the code from Module 2, Assignment 2.

public class Pet {
    //private data fields
    private String name;
    private int age;
    private String type;

    //public Constructor(s)
    public Pet() {
        this.setName("Pet Name");
        this.setAge(1);
        this.setType("Animal");
    }
    public Pet(String newName, String newType, int newAge){
        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }

    //public set or mutator method for every private data field (except when the data field is read-only
    public void setName(String newName) {
        this.name = newName;
    }
    public void setType(String newType) {
        this.type = newType;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

    //public get or accessor method for every private date field (except if it is a secret)
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public int getAge() {
        return this.age;
    }
    //public toString method that prints out all of the object state (meaning the data in the object instance
    // that you will later instantiate in the main() method
    public String toString() {
        String output = "Pet information: \nType: " + this.getType() + "\nName: " + this.getName() +
                "\nSound: " + speak() + "\nAge: " + this.getAge() + "\n";
        return output;
    }

    //public speak method returns an animal sound as a String based on Pet type
    public String speak() {
        if (this.getType() == "Dog") {
            return "Woof";
        } else if (this.getType() == "Cat") {
            return "Meow";
        } else {
            return "Noise";
        }
    }
}