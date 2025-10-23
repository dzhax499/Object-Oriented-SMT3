// // Factorials.java
// // Reads integers from the user and prints the factorial of each.
import java.util.Scanner;

// public class Factorials {
public class Factorials {
    // public static void main(String[] args) {
    public static void main(String[] args) {
        // String keepGoing = "y";
        String keepGoing = "y";
        // Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        // while (keepGoing.equals("y") || keepGoing.equals("Y")) {
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            // Think carefully about where you will need to put the try and catch.
            // Modify the main method... to catch the exception... but then continue with the loop.
            // try-catch ditempatkan di dalam loop agar loop tetap berlanjut
            try {
                // System.out.print("Enter an integer: ");
                System.out.print("Enter an integer: ");
                // int val = scan.nextInt();
                int val = scan.nextInt();
                // System.out.println("Factorial(\"" + val + "\") = " + MathUtils.factorial(val));
                System.out.println("Factorial(\"" + val + "\") = " + MathUtils.factorial(val));
            
            // catch the exception thrown by factorial
            } catch (IllegalArgumentException e) {
                // and print an appropriate message
                System.out.println(e.getMessage());
            }

            // System.out.print("Another factorial? (y/n) ");
            System.out.print("Another factorial? (y/n) ");
            // keepGoing = scan.next();
            keepGoing = scan.next();
        }
    // }
    }
}