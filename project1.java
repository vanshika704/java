import java.util.Scanner;

public class project1 {

    
    void gross(int number) {
      
        System.out.println("The gross number is: " + number/144 + " gross and " + number %144 +" eggs");
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number greater than 150: ");
            
            
            int number = scanner.nextInt();
            
            
            project1 obj = new project1();
            
            
            obj.gross(number);
        }
    }
}
