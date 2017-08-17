/*
This file explains use of static keyword
*/
package Demo4;

class Flight{
	public int numberOfPassengers, numberOfSeats;
        // static data member
        public static int numberOfFlightsCreated = 0;
	
	public void addOnePassenger(){
		if( numberOfPassengers < numberOfSeats )
			numberOfPassengers += 1;
	}
        
        // static member-function
        public static void addOneFlight(){
            numberOfFlightsCreated += 1;
//            addOnePassenger();
        }
       
        //Constructor to initialize values
        Flight() {
            numberOfPassengers = 0;
            numberOfSeats = 150;
        }
}
public class FlightDriver{
	public static void main(String args[]){
		// new for memory Allocation
		Flight delhiToBLR = new Flight();
                Flight.addOneFlight();
                System.out.println(Flight.numberOfFlightsCreated);
                
                Flight mumbaiToDelhi = new Flight();
                Flight.addOneFlight();
                System.out.println(Flight.numberOfFlightsCreated);
	}
}