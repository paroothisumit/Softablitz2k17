
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikhil
 */
public class ClientFile {
    public static void main(String args[]){
        try{
       	    // Connecting to server
            Socket sock = new Socket("localhost",5000);
            OutputStream os = sock.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            // Class to get input from STDIN
            Scanner sc = new Scanner(System.in);
            // Reading one line and storing in string
            String msg = sc.nextLine();
            dos.writeUTF(msg);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
