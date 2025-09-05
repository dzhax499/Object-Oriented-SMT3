package id.ac.polban.service;

import id.ac.polban.model.Produk;
import java.util.ArrayList;
import java.util.List;

public class KoperasiService {
    private List<Produk> daftarProd;
    private List<Transaksi> riwayatTransaksi;

    // static variable
    private static KoperasiService instance;

    // static methode
    public static KoperasiService getInstance() {
        if (instance == null ) {
            instance = new KoperasiService();
        }
        return instance;
    }

    private KoperasiService(){
        daftarProd = new ArrayList<>();
        riwayatTransaksi = new ArrayList<>();
        initializeProduk();
    }

     private void initializeProduk() {
        daftarProd.add(new Produk("Pulpen", 3500, 10, 0));
        daftarProd.add(new Produk("Buku", 7000, 15, 0));
        daftarProd.add(new Produk("Pensil", 3000, 7, 0));
        daftarProd.add(new Produk("Penghapus", 2000, 20, 0));
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

    public Produk getProdukByIndex(int index) {
        if (index >= 0 && index < daftarProd.size()) {
            return daftarProd.get(index);
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
                System.out.println("No: " + trx.GetnoTransaksi() + " | " + 
                                 trx.getProd().Getnama_prod() + " | " +
                                 "Qty: " + trx.GetjumlahBeli() + " | " +
                                 "Total: Rp." + trx.hitungTotal());
            }
        }
        System.out.println("=======================================");
    }
}