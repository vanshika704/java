
import java.util.Scanner;

public class swaptemp {
    public static void main (String args[]){
int a ; int b; int c = 0;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value of a");
a = scanner.nextInt();
System.out.println("Enter the value of b");
b = scanner.nextInt();
a = b;
b = c;
c = a ;
System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
