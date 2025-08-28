import java.util.Scanner;

public class koperasi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array produk, bisa di tambahkan disini
        Produk[] daftarProduk = {
            new Produk("Pulpen", 3500,10, 0),
            new Produk("Buku",7000,15,0),
            new Produk("Pensil",300,7,0)
        };

        // looping menu langsung menampilkan array nya
        System.out.println("-- MENU PRODUK KOEPARSI --");
        for (int i = 0 ;i < daftarProduk.length; i++) {
            System.out.println((i+1) + ". " + daftarProduk[i].Getnama_prod() + " Rp. " + daftarProduk[i].Getharga_prod()  );
        }

        // input dengan berdasarkan daftar produk length
        System.out.print("Pilih barang yang mau dibeli (1 - " + daftarProduk.length + "): " );
        int pilih = input.nextInt();

        //error handling
        if (pilih > 1 || pilih > daftarProduk.length){
            System.out.println("Pilihan tidak valid..");
            return;
        }


    }
}