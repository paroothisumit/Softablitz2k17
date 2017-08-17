package Inheritance;

public class CargoFlight extends Flight{
    private float maxCargoSpace = 100;
    private float usedCargoSpace = 0;

    

    public void addCargo(float h, float w, float d) {
        float cargoVolume = h*w*d;
        if(!hasCargoSpace(cargoVolume)){
            System.out.println("Sorry! No space left for Cargo");
            return;
        }
        usedCargoSpace += cargoVolume;
        System.out.println("Cargo added successfully!");
        
    }
    public boolean hasCargoSpace(float size) {
        return (usedCargoSpace+size <= maxCargoSpace);
    }
    
   
//    public void displayCrewCount() {
//         System.out.println("Crew Count : " + crewCount+ " (Derived Class Function Called)");
//    }
//    

 
}
