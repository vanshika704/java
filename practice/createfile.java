import java.io.*;
public class createfile {
    public static void main (String [] args){
        File file1 = new File ("abc.txt");

        try {
            if (file1.createNewFile()){
                System.out.println("File Created: " + file1.getAbsolutePath());
            }
            else{
                System.out.println ("File already exists ");
            }
        }
        catch (IOException e){
            System.out.println("Error occured ");
            e.printStackTrace();
        }
    }
}
