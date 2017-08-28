
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikhil
 */
public class ServerFile {
    public static void main(String args[]){
        try{
            // Creating server socket to listen new connection request
            ServerSocket listenSocket = new ServerSocket(5000);
            // Accepting any new request... Control will be blocked until new req hit
            Socket sock = listenSocket.accept();
            // Getting input stream from socket to read data
            InputStream is = sock.getInputStream();
            // creating wrapper over input stream to get more functionality like reading int
            DataInputStream dis = new DataInputStream(sock.getInputStream());
            //writing message
            String message = dis.readUTF();
            System.out.println(message);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
