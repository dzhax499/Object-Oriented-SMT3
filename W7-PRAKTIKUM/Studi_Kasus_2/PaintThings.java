// File: PaintThings.java

import java.text.DecimalFormat;

public class PaintThings {

    /**
     * Membuat beberapa objek bentuk dan sebuah objek Paint lalu mencetak jumlah
     * cat yang dibutuhkan untuk mengecat setiap bentuk.
     */
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        double deckAmt, ballAmt, tankAmt;

        // Instansiasi tiga bentuk untuk dicat
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);

        // Hitung jumlah cat yang dibutuhkan untuk setiap bentuk
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // Cetak jumlah cat untuk setiap bentuk
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
