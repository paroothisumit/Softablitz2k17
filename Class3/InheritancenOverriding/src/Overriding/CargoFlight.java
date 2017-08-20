/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author anshal
 */
public class CargoFlight extends Flight {
    public void cleanFlight(){
        super.cleanFlight();
        System.out.println("Cargo Flight clean function is called !");
    }
    public void fly(){
        System.out.println("Cargo Flight is ready to fly !");
    }
}
