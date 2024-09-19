import java.io.*; // Import the necessary classes for file handling


public class fileexist {
    public static void main(String[] args) {
        // Create a File object representing "abc.txt"
        File testfile1 = new File("abc.txt");
        
        // Display a message indicating the file's existence
        if (testfile1.exists()) {
            System.out.println("File exists: " + testfile1.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
