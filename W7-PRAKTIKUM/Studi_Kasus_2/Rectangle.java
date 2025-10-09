// File: Rectangle.java

public class Rectangle extends Shape {

    private double length;
    private double width;

    /**
     * Constructor: Mengatur nama, panjang, dan lebar persegi panjang.
     */
    public Rectangle(double l, double w) {
        super("Rectangle"); // Memanggil constructor kelas induk
        this.length = l;
        this.width = w;
    }

    /**
     * Menghitung dan mengembalikan luas persegi panjang. Rumus: panjang * lebar
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Mengembalikan informasi persegi panjang sebagai String.
     */
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
