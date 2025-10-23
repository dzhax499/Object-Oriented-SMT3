// // MathUtils.java
// // Provides static mathematical utility functions.
// public class MathUtils {
public class MathUtils {
    // // Returns the factorial of the argument given
    // public static int factorial(int n) {
    // Modify the header of the factorial method to indicate that factorial can throw
    public static int factorial(int n) throws IllegalArgumentException {
        
        // Modify the body of factorial to check the value of the argument and, if it is negative,
        if (n < 0) {
            // throw an IllegalArgumentException.
            // Use this parameter to be specific about what the problem is.
            throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        }
        
        // Modify your code in factorial to check for an argument over 16
        if (n > 16) {
            // The problem is arithmetic overflow
            // throw an IllegalArgumentException in either case, but pass different messages
            throw new IllegalArgumentException("Argument too large (over 16); result will overflow int.");
        }

        // int fac = 1;
        int fac = 1;
        // for (int i=n; i>0; i--)
        for (int i=n; i>0; i--)
            // fac *= i;
            fac *= i;
        // return fac;
        return fac;
    // }
    }
// }
}