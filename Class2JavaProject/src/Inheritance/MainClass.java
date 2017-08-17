
package Inheritance;

public class MainClass {
   
    public static void main(String args[]) {
         
        Flight fl = new Flight();
         for(int i=0; i<5; i++) {
             fl.addOnePassenger();
         }
         
         CargoFlight cf = new CargoFlight();
//         cf.displayCrewCount();
         
         for(int i=0; i<5; i++) {
             cf.addOnePassenger();
             cf.addCargo(4, 4, 4);
         }
         
         
         Flight squadron[] = new Flight[4];
         squadron[0] = new Flight();
         squadron[1] = new CargoFlight();
         squadron[2] = new CargoFlight();
         squadron[3] = new Flight();
         
         for(int i=0; i<4; i++){
             squadron[i].addOnePassenger();
         }
    }

}
