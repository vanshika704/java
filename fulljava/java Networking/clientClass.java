import java.io.*;
import java.net.*;


public class clientClass {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hor bhyi hogya connect aagye swaad?");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
            System.out.println("Exception generated " + e);
        }
    }
    
}
