// File: Shape.java

public abstract class Shape {

    // Variabel instance untuk nama bentuk
    private String shapeName;

    /**
     * Constructor untuk mengatur nama bentuk. Dipanggil oleh kelas anak
     * menggunakan super().
     */
    public Shape(String name) {
        this.shapeName = name;
    }

    /**
     * Metode abstrak untuk menghitung luas. Harus diimplementasikan oleh setiap
     * kelas anak.
     */
    public abstract double area();

    /**
     * Mengembalikan nama bentuk sebagai String.
     */
    public String toString() {
        return shapeName;
    }
}
