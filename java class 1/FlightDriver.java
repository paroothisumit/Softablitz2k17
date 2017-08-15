class Flight{
	
	//Data Members or Properties
	public int numberOfPassengers, numberOfSeats;
	
	//Methods or Behaviors
	public void addOnePassenger(){
		if( numberOfPassengers < numberOfSeats )
			numberOfPassengers += 1;
	}

	//More behaviours

	//Constructor to provide intial values
	Flight(){
		numberOfSeats = 150;
		numberOfPassengers = 0;
	}

}
public class FlightDriver{
	public static void main(String args[]){
		//new for memory Allocation
		Flight delhiToBLR = new Flight();
//		delhiToBLR.addOnePassenger();
		System.out.println( delhiToBLR.numberOfPassengers );

		delhiToBLR.numberOfPassengers += 1;
		System.out.println(delhiToBLR.numberOfPassengers );

//		delhiToBLR.addOnePassenger();
//		System.out.println( delhiToBLR.numberOfPassengers );
	}
}
