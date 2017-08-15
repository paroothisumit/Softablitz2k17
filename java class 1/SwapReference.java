class Flight{
	public int flightNumber;
	public Flight( int fNumber){
		flightNumber = fNumber; 
	}
}

public class SwapReference{
	static void swap( Flight flightA, Flight flightB){
		int tmp = flightA.flightNumber;
		flightA.flightNumber = flightB.flightNumber;
		flightB.flightNumber = tmp;
		//Following way won't swap
//		Flight tmp = flightA;
//		flightA = flightB;
//		flightB = tmp; 
	}
	public static void main(String args[]){
		Flight flightA = new Flight(2);
		Flight flightB = new Flight(3);
		swap( flightA, flightB);
		System.out.println( " flightA number is -> " 
						+ flightA.flightNumber + 
							"\n flightB number is -> " 
							+ flightB.flightNumber);
	}

}
