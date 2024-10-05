//Java Socket programming is used for communication between the applications running on different JRE.
//Socket class
// A socket is simply an endpoint for communications between the machines. The Socket class can be used to create a socket.
//METHODS 
// public InputStream getInputStream()  : returns the InputStream attached with this socket.
//public OutputStream getOutputStream() : returns the OutputStream attached with this socket.
//public synchronized void close() : closes the socket

import java.io.*;  // Import for I/O
import java.net.*; // Import for networking

public class ServerClass {  // Class created
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666); // Server established on port 6666
            System.out.println("Server is listening on port 6666...");

            Socket s = ss.accept();  // Connection established, waiting for client
            System.out.println("Client connected.");

            // If you want to receive a message from the client, you can uncomment this:
            DataInputStream dis = new DataInputStream(s.getInputStream()); // Read from client
            String clientMessage = dis.readUTF(); // Reading client message
            System.out.println("Client says: " + clientMessage);  // Print client's message

            // Server-side message
            String str = "Hor byi kaisi lgi"; // Server's message
            System.out.println("Aapke liye gupt sandesh: " + str);  // Print server's message

            // Close streams and sockets
            dis.close();
            s.close(); // Close the socket
            ss.close(); // Close the ServerSocket

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
