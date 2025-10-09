// Nama File: Staff.java (versi modifikasi)

public class Staff {

    StaffMember[] staffList;

    public Staff() {
        // Ukuran array diubah menjadi 8 [cite: 24]
        staffList = new StaffMember[8];

        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        // Menambahkan dua karyawan komisi baru [cite: 24]
        // Karyawan 1: $6.25/jam, 20% komisi [cite: 25]
        staffList[6] = new Commission("Budi", "Jl. Merdeka No. 10", "0812345678", "111-22-333", 6.25, 0.20);

        // Karyawan 2: $9.75/jam, 15% komisi [cite: 25]
        staffList[7] = new Commission("Siti", "Jl. Kemerdekaan No. 20", "0898765432", "444-55-666", 9.75, 0.15);

        // Mengatur data untuk karyawan yang sudah ada
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);

        // Mengatur jam kerja dan penjualan untuk karyawan komisi
        // Karyawan 1: 35 jam, $400 penjualan [cite: 26]
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(400);

        // Karyawan 2: 40 jam, $950 penjualan [cite: 27]
        ((Commission) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(950);
    }

    public void payday() {
        double amount;

        System.out.println("-------------------- PAYDAY REPORT --------------------");
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay(); // Panggilan polimorfik

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }
            System.out.println("-----------------------------------------------------");
        }
    }
}
