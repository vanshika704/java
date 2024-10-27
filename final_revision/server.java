import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1156);
          
            Socket s = ss.accept();
            String str = "Hello from the server";
            
            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.print(str);
            ps.close();
            os.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
