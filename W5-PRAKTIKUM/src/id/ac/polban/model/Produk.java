package id.ac.polban.model;

/**
 * Kelas Produk merepresentasikan item-item yang dijual di koperasi. Ini adalah
 * kelas dasar (superclass) yang menyimpan informasi umum produk.
 */
public class Produk {

    private String nama_prod;
    private int harga_prod;
    private int stok_prod;

    // static 
    private static int totalProduk = 0;

    /**
     * Konstruktor untuk membuat objek Produk baru.
     *
     * @param nama_prod Nama produk.
     * @param harga_prod Harga produk per unit.
     * @param stok_prod Jumlah stok produk yang tersedia.
     */
    public Produk(String nama_prod, int harga_prod, int stok_prod) {
        this.nama_prod = nama_prod;
        this.harga_prod = harga_prod;
        this.stok_prod = stok_prod;
        totalProduk++;
    }

    // GETTER
    /**
     * Mengembalikan nama produk.
     *
     * @return Nama produk.
     */
    public String Getnama_prod() {
        return nama_prod;
    }

    /**
     * Mengembalikan harga produk. Ini adalah metode yang akan di-override di
     * subclass.
     *
     * @return Harga produk per unit.
     */
    public int Getharga_prod() {
        return harga_prod;
    }

    /**
     * Mengembalikan jumlah stok produk yang tersedia.
     *
     * @return Jumlah stok produk.
     */
    public int Getstok_prod() {
        return stok_prod;
    }

    // STATIC METHOD
    /**
     * Mengembalikan total jumlah produk yang telah dibuat.
     *
     * @return Total produk.
     */
    public static int GetTotalProduk() {
        return totalProduk;
    }

    // SETTER
    /**
     * Mengatur jumlah stok produk.
     *
     * @param stok_prod Jumlah stok baru.
     */
    public void setStok_prod(int stok_prod) {
        this.stok_prod = stok_prod;
    }

    // METHOD
    /**
     * Mengurangi stok produk setelah transaksi berhasil.
     *
     * @param jumlah Jumlah produk yang dibeli.
     * @return True jika stok mencukupi dan berhasil dikurangi, false
     * sebaliknya.
     */
    public boolean kurangi_prod(int jumlah) {
        if (stok_prod >= jumlah) {
            stok_prod = stok_prod - jumlah;
            return true;
        }
        return false;
    }

    /**
     * Mengembalikan representasi string dari objek Produk.
     *
     * @return String yang berisi nama, harga, dan stok produk.
     */
    @Override
    public String toString() {
        return nama_prod + " - Rp" + harga_prod + " (Stok: " + stok_prod + ")";
    }
}
