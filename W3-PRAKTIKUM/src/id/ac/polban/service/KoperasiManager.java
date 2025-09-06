package id.ac.polban.service;

import id.ac.polban.model.Produk;
import java.util.ArrayList;
import java.util.List;

public class KoperasiManager {
    private List<Produk> daftarProd;
    private List<Transaksi> riwayatTransaksi;

    //  STATIC VARIABLES (Singleton Pattern)
    private static KoperasiManager instance;

    // static methode
    public static KoperasiManager getInstance() {
        if (instance == null ) {
            instance = new KoperasiManager();
        }
        return instance;
    }

    private KoperasiManager(){
        daftarProd = new ArrayList<>();
        riwayatTransaksi = new ArrayList<>();
        isi_prod();
    }

     private void isi_prod() {
        daftarProd.add(new Produk("Pulpen", 3500, 10));
        daftarProd.add(new Produk("Buku", 7000, 15));
        daftarProd.add(new Produk("Pensil", 3000, 7));
        daftarProd.add(new Produk("Penghapus", 2000, 20));
    }

    public List<Produk> getDaftarProd(){
        return daftarProd;
    }

    public void TampilMenu() {
        System.out.println("========== MENU PRODUK KOPERASI ==========");
        for (int i = 0; i < daftarProd.size(); i++) {
            System.out.println((i + 1) + ". " + daftarProd.get(i).toString());
        }
        System.out.println("==========================================");
        System.out.println("Total jenis produk: " + Produk.GetTotalProduk());
        System.out.println("==========================================");
    }

    public Produk getProd(int index) {
        if (index >= 1 && index <= daftarProd.size()) {
            return daftarProd.get(index -1 );
        }
        return null;
    }

    public boolean validasiPilihan(int pilihan) {
        return pilihan >= 1 && pilihan <= daftarProd.size();
    }

    public boolean validasiStok(Produk produk, int jumlah) {
        return produk.Getstok_prod() >= jumlah;
    }

    public void tambahTransaksi(Transaksi transaksi){
        riwayatTransaksi.add(transaksi);
    }

    public void tampilkanRiwayatTransaksi() {
        System.out.println("========== RIWAYAT TRANSAKSI ==========");
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (Transaksi trx : riwayatTransaksi) {
                System.out.println("No: " + trx.getProd() + " | " + 
                                 trx.getProd().Getnama_prod() + " | " +
                                 "Qty: " + trx.GetjumlahBeli() + " | " +
                                 "Total: Rp." + trx.hitungTotal());
            }
        }
        System.out.println("=======================================");
    }
}