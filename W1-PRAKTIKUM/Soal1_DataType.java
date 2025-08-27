import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jumalah T: ");
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");
                
                // byte
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }
                
                // short
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                
                // int
                if (n >= -2147483648 && n <= 2147483647) {
                    System.out.println("* int");
                }
                
                // long
                System.out.println("* long");
                
            } catch (Exception e) {
                String number = scanner.next();
                System.out.println(number + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

