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
public class PrivateJet extends Flight {
    public void cleanFlight(){
        System.out.println("Private Flight clean function is called !");
    }
    public void fly(){
        System.out.println("Private Flight is ready to fly !");
    }
    
}
