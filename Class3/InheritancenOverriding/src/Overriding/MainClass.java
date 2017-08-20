/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

import java.util.Scanner;

/**
 *
 * @author anshal
 */
public class MainClass {
    public static void launchFlight(Flight f){
        f.cleanFlight();
        f.fly();
        System.out.println("Flight Launched Successfully");
    }
    public static void main(String a[]){
        Flight flights[] = new Flight[4];
        flights[0] = new Flight();
        flights[1] = new CargoFlight();
        flights[2] = new PrivateJet();
        flights[3] = new FighterJet();
        
        for(int i=0;i<4;i++){
            flights[i].cleanFlight();
        }
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of flights");
//        int n = sc.nextInt();
//        System.out.println("1 : Generic Flight");
//        System.out.println("2 : CargoFlight");
//        System.out.println("3 : PrivateJet");
//        System.out.println("4 : FighterJet");
//        
//        Flight f[] = new Flight[n];
//        
//        for(int i=0; i<n; i++){
//            int type = sc.nextInt();
//            switch(type){
//                case 1:
//                    f[i] = new Flight();
//                    break;
//                case 2:
//                    f[i] = new CargoFlight();
//                    break;
//                case 3:
//                    f[i] = new PrivateJet();
//                    break;
//                case 4:
//                    f[i] = new FighterJet();
//                    break;       
//            }
//            launchFlight(f[i]);
//        }
//        
//        Object o = new Flight();
//        //o.cleanFlight();
//        Flight fl = (Flight)o;
//        fl.cleanFlight();
    }
}
