/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author nikhil
 */
public class ReceiveThread extends Thread{
    Socket socket;
    public void run(){
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(socket.getInputStream());
            // Reading input and printing if any input received
            while(true){
                String msg = dis.readUTF();
                System.out.println("Received:" + msg + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public ReceiveThread(Socket sock){
        this.socket = sock;
    }
}
