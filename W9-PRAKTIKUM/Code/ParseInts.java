// // ParseInts.java
// // Reads a line of text and prints the integers in the line.
import java.util.Scanner;

// public class ParseInts {
public class ParseInts {
    // public static void main(String[] args) {
    public static void main(String[] args) {
        // int val, sum=0;
        int val, sum=0;
        // Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        // String line;
        // System.out.println("Enter a line of text");
        System.out.println("Enter a line of text");
        // Scanner scanLine = new Scanner(scan.nextLine());
        Scanner scanLine = new Scanner(scan.nextLine());

        // while (scanLine.hasNext()) {
        while (scanLine.hasNext()) {
            // To make it continue, move the try and catch inside the loop.
            try {
                // val = Integer.parseInt(scanLine.next());
                val = Integer.parseInt(scanLine.next());
                // sum += val;
                sum += val;
            // Catch a NumberFormatException
            } catch (NumberFormatException e) {
                // and have an empty body for the catch.
                // Blok catch sengaja dikosongkan untuk mengabaikan token non-integer
                // dan melanjutkan ke iterasi loop berikutnya
            }
        // }
        }
        // System.out.println("The sum of the integers on this line is " + sum);
        System.out.println("The sum of the integers on this line is " + sum);
    // }
    }
}