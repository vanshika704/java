import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1156);
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = br.readLine();
            System.out.println("Server says: " + str);
            
            // Sending response back to server if needed
            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.print("The client says hello");
            
            ps.close();
            os.close();
            br.close();
            is.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
