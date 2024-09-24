// when a class has multiple methods having same name but different in parameters , it is known as method overloading .
public class method_overloading {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        method_overloading obj = new method_overloading();

        // Calling the method with two parameters
        System.out.println(obj.add(1, 5));

        // Calling the method with three parameters
        System.out.println(obj.add(1, 3, 5));
    }
}
