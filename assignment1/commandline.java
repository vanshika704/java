package assignment1;

public class commandline {
    public static void main(String args[]) {
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println("Your number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}

// public class commandline {
//     public static void main(String[] args) {
//         if (args.length > 0) {
//             try {
//                 // Convert the first argument to an integer
//                 int number = Integer.parseInt(args[0]);
//                 System.out.println("The received integer is: " + number);
//             } catch (NumberFormatException e) {
//                 System.out.println("Please provide a valid integer.");
//             }
//         } else {
//             System.out.println("No command line arguments provided.");
//         }
//     }
// }
