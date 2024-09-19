class MyCustomException extends Exception { // class bnai myexception joki exception extend kregi 
    public MyCustomException(String message) { // constructor bnaaoge uski exception ka or vo ek argyuement lega meaasge name se
        super(message); // super message krke parent class se message pick krliya
    }
}

public class Prog1 { // class bnai
    public static void main(String[] args) {
        try { // try block lgaya ki agr input do number se kam dedi toh error dikhado
            if (args.length != 2) {
                throw new MyCustomException("Please provide exactly two arguments.");
            }

            String string1 = args[0];
            String string2 = args[1];

            // Validate both inputs
            checkForInvalidCharacters(string1); // yha method ko call lgai h or usme value pass ki h string 1 ki
            checkForInvalidCharacters(string2);

            System.out.println("Both inputs are valid numbers.");
        } catch (MyCustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check for non-numeric characters
    public static void checkForInvalidCharacters(String input) throws MyCustomException { // jab koi method direct exception throw krta h , bina try catch ke toh usme throws lgta h
        for (char c : input.toCharArray()) { // c ek vairable intialize kiya or input ko chararray me convert krdiya taaki ek element aceesible hoje
            if (!Character.isDigit(c)) { // agar nahi hua toh exception dedo
                throw new MyCustomException("Input '" + input + "' contains invalid characters.");
            }
        }
    }
}
