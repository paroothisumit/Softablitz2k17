/*
This file explains this and null keywords and default constructor
*/
package Demo2;

class Flight{
	
	public int numberOfPassengers, numberOfSeats;
	
	public void addOnePassenger(){
		if( numberOfPassengers < numberOfSeats )
			numberOfPassengers += 1;
	}
        
	//Constructor to provide intial values
	Flight(){
		numberOfSeats = 150;
                // this keyword is used to refer to the current object
		this.numberOfPassengers = 0;
                System.out.println(this);
	}
}
public class FlightDriver{
	public static void main(String args[]){
		// new for memory Allocation
		Flight delhiToBLR = new Flight();
                System.out.println(delhiToBLR.numberOfPassengers + " " + delhiToBLR.numberOfSeats);
                System.out.println(delhiToBLR);
                // null keyword is used when reference points to nothing
                Flight mumbaiToDelhi = null;
                System.out.println(mumbaiToDelhi);
	}
}