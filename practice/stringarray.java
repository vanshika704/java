// Prog2: Write a program in java that accepts an argument from command line.
//  Create a method that splits that number and store each digit of the number in an array. Display the sum of that array. 
 
public class stringarray { // class  bnao stringarray naam se
    public static void main(String[] args) {
        if (args.length > 0) { // vohi ghisi puti baat ki agar args.length bde h 0 se yaani aasan bhasha me bole toh agr input di gyi h
            try { // toh try block me aajao
                int number = Integer.parseInt(args[0]); // sabse phle declare krdo , ki number , joki string format me aara h usko integer me krdo
                int sum = sumOfDigits(number); // method call kra
                System.out.println("Sum of digits: " + sum); // print krwadiya sum
            } catch (NumberFormatException e) { // exception handle krdi
                System.out.println("Error: Invalid number format.");
            }
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }

    public static int sumOfDigits(int number) { // chota sa mehtod bnaya jisme  did=guits nikaalre h
        int sum = 0; // intjialize krdia sum
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
