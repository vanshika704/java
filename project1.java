import java.util.Scanner;

public class project1 {

    
    void value(int number) {
      
        System.out.println("Your number of egss is: " + number/144 + " gross and " + (number %144)/12 +" dozen " + number % 12 + " eggs");
        
        
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            
            
            int number = scanner.nextInt();
            
            
            project1 obj = new project1();
            
            
            obj.value(number);
        }
    }
}
