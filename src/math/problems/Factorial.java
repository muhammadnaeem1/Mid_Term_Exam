package math.problems;

public class Factorial {


    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    // Recursive implementation

    public static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = factorialRecursive(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}




