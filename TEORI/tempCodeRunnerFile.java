import java.util.Scanner;

public class PujasPolban {    
    private String nama;
    private int jumlah;
    private int harga;

    public PujasPolban(String nama, int jumlah, int harga)
    {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    public String GetNama()
    {
        return nama;
    }

    public int Getjumlah()
    {
        return jumlah;
    }
    public int GetHarga()
    {
        return harga;
    }

    // public void SetNama(String newnama)
    // {
    //     this.nama = newnama;
    // }
    // public void Setjumlah(int newjumlah)
    // {
    //     this.jumlah = newjumlah;
    // }
    // public void SetHarga(int newharga)
    // {
    //     this.harga = newharga;
    // }

    public static void main(String []args) throws java.io.IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("-- MENU MAKANAN PUJAS --");
        System.out.println("1. Nasi Goreng Spesial");
        System.out.println("2. Mie Goreng Spesial");
        System.out.println("3. Ayam Bakar Spesial");
        System.out.println("4. Ayam Geprek Spesial");

        System.out.println("------------------------");
        System.out.print("Pilihan Anda : ");
        int pilihan = input.nextInt();

        String nama_makan = "";
        int harga_mkn =0;
        
        switch (pilihan) {
            case 1: nama_makan = "Nasi Goreng Spesial"; harga_mkn = 15000; break;
            case 2: nama_makan = "Mie Goreng Spesial"; harga_mkn = 10000; break;
            case 3: nama_makan = "Ayam Bakar Spesial"; harga_mkn = 20000; break;
            case 4: nama_makan = "Ayam Geprek Spesial"; harga_mkn = 12000; break;
        }

        System.out.print("Jumlah Makanan: ");
        int jml_mkn = input.nextInt();

        PujasPolban pesanan = new PujasPolban(nama_makan, jml_mkn, harga_mkn);

        int total = pesanan.GetHarga() * jml_mkn;

        System.out.println("\n-- STRUK PESANAN --");
        System.out.println("Pesanan   : " + pesanan.GetNama());
        System.out.println("Jumlah    : " + pesanan.Getjumlah());
        System.out.println("Harga     : Rp" + pesanan.GetHarga());
        System.out.println("Total     : Rp" + total);
        System.out.println("-------------------");
    }
}