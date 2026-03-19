import java.util.Scanner;

public class ComputeFactorial {
    // Main method
    public static void main(String[]args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
           System.out.print("Enter a nonnegative integer: ");
           int n = input.nextInt();
           // Display Factorial
              System.out.println("Factorial of " + n + " is " + factorial(n));

              input.close();
    }
    // Return the factorial for the specified number
    public static long factorial (int n) {
        if ( n == 0) { 
            return 1; 
        }
        else  { 
            return n * factorial(n-1); // Recursive call
        }

        }
    }
    
