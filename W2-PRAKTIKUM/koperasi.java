import java.util.Scanner;

public class koperasi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produk[] daftarProduk = {
            new Produk("Pulpen", 3500,10, 0),
            new Produk("Buku",7000,15,0),
            new Produk("Pensil",300,7,0)
        };
        
        System.out.println("-- MENU PRODUK KOEPARSI --");
        for (int i = 0 ;i < daftarProduk.length; i++) {
            System.out.println((i+1) + ". " + daftarProduk[i].Getnama_prod() + " Rp. " + daftarProduk[i].Getharga_prod()  );
        }

        System.out.print("Pilih barang yang mau dibeli (1 - " + daftarProduk.length + "): " );
        int pilih = input.nextInt();
    }
}