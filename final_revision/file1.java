import java.io.FileInputStream;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// creating a file : File file = new File ("hello.txt");
// file.createfile();

//writing to a file : FileWriter fw = new FileWriter("hello.txt");
// BufferedWriter bw = new BufferedWriter(fw);

// reading from a file :FileReader fr = new FileReader("hello.txt");
// BufferedReader br = new BufferedReader(fr);