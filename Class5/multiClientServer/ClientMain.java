/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author nikhil
 */
public class ClientMain {
    public static void main(String args[]){
        try{
            Socket socket = new Socket("localhost", 5000);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter client ID:");
            String clientID = sc.nextLine();
            
            // repeatedly taking input and sending to server
            while(true){
                String msg = sc.nextLine();
                dos.writeUTF("I am client with ID " + clientID + " " + msg);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
