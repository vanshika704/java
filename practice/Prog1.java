class MyCustomException extends Exception { // class bnai custom exception ke liye taaki exception extend krwa ske 
    public MyCustomException(String message) {
        super(message);
    }
}

public class Prog1 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new MyCustomException("Please provide exactly two arguments.");
            }

            String string1 = args[0];
            String string2 = args[1];

            // Validate the strings using the custom exception
            validateInput(string1);
            validateInput(string2);

            System.out.println("Both inputs are valid numbers.");
        } catch (MyCustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to validate input and throw an exception if it contains non-numeric characters
    public static void validateInput(String input) throws MyCustomException {
        if (!input.matches("\\d+")) {
            throw new MyCustomException("Input '" + input + "' contains alphabets or special characters.");
        }
    }
}
