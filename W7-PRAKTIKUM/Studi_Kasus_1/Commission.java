// Nama File: Commission.java

public class Commission extends Hourly {

    private double totalSales;      // Total penjualan yang dibuat
    private double commissionRate;  // Tingkat komisi (dalam desimal, misal 0.20 untuk 20%)

    /**
     * Constructor untuk membuat objek Commission. Memanggil constructor dari
     * kelas induk (Hourly) dan menginisialisasi variabel komisi.
     */
    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commRate) {
        // Memanggil constructor kelas induk (Hourly) 
        super(eName, eAddress, ePhone, socSecNumber, rate);

        // Mengatur tingkat komisi 
        this.commissionRate = commRate;
        this.totalSales = 0; // Inisialisasi total penjualan awal adalah 0
    }

    /**
     * Metode untuk menambahkan total penjualan.
     */
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    /**
     * Meng-override metode pay() dari kelas induk. Menghitung total gaji =
     * (gaji per jam) + (gaji komisi).
     */
    @Override
    public double pay() {
        // 1. Hitung gaji per jam dengan memanggil metode pay() dari kelas induk (Hourly) 
        double hourlyPayment = super.pay();

        // 2. Hitung gaji dari komisi
        double commissionPayment = totalSales * commissionRate;

        // 3. Reset total penjualan kembali ke 0 setelah dihitung 
        totalSales = 0;

        // 4. Kembalikan total pembayaran
        return hourlyPayment + commissionPayment;
    }

    /**
     * Meng-override metode toString() untuk menambahkan informasi total
     * penjualan.
     */
    @Override
    public String toString() {
        // Memanggil toString() dari kelas induk (Hourly) untuk mendapatkan info dasar 
        String result = super.toString();

        // Menambahkan informasi total penjualan
        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}
