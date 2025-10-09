// File: Cylinder.java

public class Cylinder extends Shape {

    private double radius;
    private double height;

    /**
     * Constructor: Mengatur nama, radius, dan tinggi silinder.
     */
    public Cylinder(double r, double h) {
        super("Cylinder"); // Memanggil constructor kelas induk
        this.radius = r;
        this.height = h;
    }

    /**
     * Menghitung dan mengembalikan luas permukaan silinder. Rumus sesuai
     * instruksi: PI * radius^2 * tinggi
     */
    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    /**
     * Mengembalikan informasi silinder sebagai String.
     */
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
