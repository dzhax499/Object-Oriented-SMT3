// File: Paint.java

public class Paint {

    private double coverage; // jumlah kaki persegi per galon

    /**
     * Constructor: Mengatur objek cat.
     */
    public Paint(double c) {
        coverage = c;
    }

    /**
     * Mengembalikan jumlah cat (dalam galon) yang dibutuhkan untuk mengecat
     * bentuk yang diberikan sebagai parameter.
     */
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // PERBAIKAN: Menghitung jumlah cat dengan benar
        // Rumus: luas / cakupan
        return s.area() / coverage;
    }
}
