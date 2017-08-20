package Inheritance;

public class Flight {
    private int numOfPassenger = 0;
    private int seats = 4;
    private int crewCount = 10;
    
    
    public void addOnePassenger(){
        if(!hasSeat()){
            System.out.println("Sorry! No space left for passenger");
            return;
        }
        numOfPassenger += 1;
        System.out.println("Passenger added successfully!");
    }
    
    public boolean hasSeat() {
        return numOfPassenger < seats ;
    }
    
//    public void displayCrewCount() {
//        System.out.println("Crew Count : " + crewCount+ " (Base Class Function Called)");
//    }
}
