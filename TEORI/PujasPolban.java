
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
        System.out.println("-- MENU MAKANAN PUJAS --");
        System.out.println("1. Nasi Goreng Spesial");
        System.out.println("2. Mie Goreng Spesial");
        System.out.println("3. Ayam Bakar Spesial");
        System.out.println("4. Ayam Geprek Spesial");

        System.out.println("------------------------");
        System.out.print("Pilihan Anda : ");
        int pilihan = System.in.read();
        System.out.println("pilihan anda: " + (char)pilihan );

        PujasPolban pesanan = new PujasPolban("Nasi Goreng Spesial", 2, 15000);

        String nama = pesanan.GetNama();
        int jumlah = pesanan.Getjumlah();
        int harga = pesanan.GetHarga();
        int total = jumlah * harga;
        System.out.println("Pesanan: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga per porsi: " + harga);
        System.out.println("Total Harga : " + total);
    }
}