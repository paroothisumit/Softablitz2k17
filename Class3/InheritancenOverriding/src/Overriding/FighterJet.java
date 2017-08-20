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
public class FighterJet extends Flight {
    public void cleanFlight(){
        System.out.println("Fighter Jet clean function is called !");
    }
    public void fly(){
        System.out.println("Fighter Jet is ready to fly !");
    }
}
