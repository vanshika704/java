import java.io.*; // import kro java ki io library 
public class createfile { // class bnao create file 
    public static void main (String [] args){ // main method call lgado
        File file1 = new File ("hello.jsx"); // file initiate krdo abc.txt name se 

        try { // try catch block h 
            if (file1.createNewFile()){ // file1.createNewfile() krke new method bnado , or print krwado ki kaam hogya h maalik
                System.out.println("File Created: " + file1.getAbsolutePath());
            }
            else{
                System.out.println ("File already exists "); // agar already bni hui file toh yha se chakk lo exception
            }
        }
        catch (IOException e){
            System.out.println("Error occured ");
            e.printStackTrace();
        }
    }
}
