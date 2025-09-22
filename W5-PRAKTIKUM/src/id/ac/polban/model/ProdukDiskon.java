package id.ac.polban.model;

/**
 * Kelas ProdukDiskon adalah subclass dari Produk yang menambahkan
 * fungsionalitas diskon. Kelas ini mewarisi semua atribut dan metode dari
 * Produk.
 */
public class ProdukDiskon extends Produk {

    private double persenDiskon;

    /**
     * Konstruktor untuk membuat objek ProdukDiskon. Memanggil konstruktor
     * superclass Produk untuk inisialisasi properti dasar.
     *
     * @param nama_prod Nama produk.
     * @param harga_prod Harga produk per unit.
     * @param stok_prod Jumlah stok produk.
     * @param persenDiskon Persentase diskon yang diberikan (dalam persen, misal
     * 10.0).
     */
    public ProdukDiskon(String nama_prod, int harga_prod, int stok_prod, double persenDiskon) {
        // Memanggil konstruktor superclass dengan keyword 'super'
        super(nama_prod, harga_prod, stok_prod);
        this.persenDiskon = persenDiskon;
    }

    /**
     * Meng-override metode Getharga_prod() dari superclass Produk. Metode ini
     * menghitung harga produk setelah dikurangi diskon.
     *
     * @return Harga produk setelah diskon.
     */
    @Override
    public int Getharga_prod() {
        // Menggunakan 'super' untuk mendapatkan harga dasar dari superclass
        double hargaAsli = super.Getharga_prod();
        double hargaSetelahDiskon = hargaAsli - (hargaAsli * persenDiskon / 100);
        return (int) Math.round(hargaSetelahDiskon);
    }

    /**
     * Mengembalikan representasi string dari objek ProdukDiskon, termasuk
     * informasi diskon.
     *
     * @return String yang berisi nama, harga, stok, dan diskon produk.
     */
    @Override
    public String toString() {
        return super.Getnama_prod() + " - Rp" + Getharga_prod() + " (Diskon " + persenDiskon + "%)" + " (Stok: " + super.Getstok_prod() + ")";
    }
}
