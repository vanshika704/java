import java.util.Scanner;

public class stringmethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two input strings
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        // Reversing the first string using StringBuilder
        StringBuilder str1 = new StringBuilder(input1);  
        str1.reverse(); 

        // Reversing the second string using StringBuilder
        StringBuilder str2 = new StringBuilder(input2);
        str2.reverse();

        // Concatenating the reversed strings using append
        String output = str1.append(str2).toString();
        // Output the result
        System.out.println("Concatenated Reversed Strings: " + output);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
