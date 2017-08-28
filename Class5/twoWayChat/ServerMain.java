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
public class ServerMain {
    public static void main(String args[]){
        try{
            ServerSocket listenSocket = new ServerSocket(5000);
            System.out.println("Server Started and listening for client");
            Socket socket = listenSocket.accept();
            System.out.println("Client connected");
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            
            ReceiveThread receivingThread = new ReceiveThread(socket);
            //Starting thread that will continuosly listen for any input from server            
            receivingThread.start();
            
            // repeatedly taking input and sending to server
            while(true){
                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();
                dos.writeUTF(msg);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
