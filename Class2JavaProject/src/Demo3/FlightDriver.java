/*
This file explains parameterized constructor and constructor overloading
*/
package Demo3;

class Flight{
	
	int numberOfPassengers, numberOfSeats;
	
	public void addOnePassenger(){
		if( numberOfPassengers < numberOfSeats )
			numberOfPassengers += 1;
	}
        
        //Parameterized constructor
        Flight(int numberOfPassengers, int numberOfSeats){
            this.numberOfPassengers = numberOfPassengers;
            this.numberOfSeats = numberOfSeats;
            System.out.println("Parameterized constructor called!!!");
        }
        
	//Constructor to provide intial values
	Flight(){
		this.numberOfSeats = 150;
                this.numberOfPassengers = 0;
                System.out.println("Non-Parameterized constructor called!!!");
	}
}
public class FlightDriver{
	public static void main(String args[]){
		// new for memory Allocation
		Flight delhiToBLR = new Flight(0, 300);
                System.out.println(delhiToBLR.numberOfSeats);
                delhiToBLR.addOnePassenger();
                System.out.println(delhiToBLR.numberOfPassengers);
                
                Flight mumbaiToDelhi = new Flight();
                System.out.println(mumbaiToDelhi.numberOfSeats);
	}
}