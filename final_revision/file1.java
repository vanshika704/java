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
