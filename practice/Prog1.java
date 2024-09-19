class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Prog1 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new MyCustomException("Please provide exactly two arguments.");
            }

            String string1 = args[0];
            String string2 = args[1];

            // Validate both inputs
            checkForInvalidCharacters(string1);
            checkForInvalidCharacters(string2);

            System.out.println("Both inputs are valid numbers.");
        } catch (MyCustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check for non-numeric characters
    public static void checkForInvalidCharacters(String input) throws MyCustomException {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new MyCustomException("Input '" + input + "' contains invalid characters.");
            }
        }
    }
}
