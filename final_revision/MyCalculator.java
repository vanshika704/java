//Prog8: Create an interface AdvancedArithmetic which contains a method signature int divisor_Sum(int n). 
//You need to write a class called MyCalculator which implements the interface. 
//Divisor_Sum function just takes an integer as input and return the sum of all its divisors. 
//For example divisors of 6 are 1, 2, 3 and 6, so divisor_Sum should return 12. The value of n will be at most 1000.

// Interface AdvancedArithmetic with method signature
interface AdvancedArithmetic {
    int divisor_Sum(int n);
}

// Class A implementing the interface AdvancedArithmetic
class A implements AdvancedArithmetic {
    // Implementing the divisor_Sum method
    public int divisor_Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i; // Add divisor to the sum
            }
        }
        return sum; // Return the total sum of divisors
    }
}

// Main class MyCalculator
public class MyCalculator {
    public static void main(String args[]) {
        // Create an object of class A
        A obj1 = new A();
        
        // Test the divisor_Sum method with an example value
        int n = 6; // Example value
        System.out.println("Sum of divisors of " + n + ": " + obj1.divisor_Sum(n));
    }
}
