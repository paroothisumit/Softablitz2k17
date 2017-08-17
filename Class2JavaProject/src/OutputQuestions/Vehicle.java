package OutputQuestions;

// Practice Problem

public class Vehicle {
    
    // Data-Members
    private String name;
    private int numberOfSeats;
    private int numberOfWheels;

    // Non-parameterized constructor
    Vehicle(){
        name = "Car";
        numberOfSeats = 4;
        numberOfWheels = 4;
    }
    
    // Parameterized Constructor
    Vehicle(String name, int numberOfSeats, int numberOfWheels){
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
    }
    
    // Member-Function
    public void blowHorn(){
        System.out.println("Beep Beep!");
    }
}