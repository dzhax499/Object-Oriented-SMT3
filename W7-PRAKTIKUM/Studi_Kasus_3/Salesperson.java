// File: Salesperson.java
// Representasi data penjual

public class Salesperson implements Comparable {

    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    @Override
    public int compareTo(Object other) {
        int result;
        Salesperson otherSalesperson = (Salesperson) other;

        // Bandingkan berdasarkan total penjualan
        if (this.totalSales < otherSalesperson.getSales()) {
            result = -1;
        } else if (this.totalSales > otherSalesperson.getSales()) {
            result = 1;
        } else {
            // Jika penjualan sama, bandingkan berdasarkan nama belakang
            result = this.lastName.compareTo(otherSalesperson.getLastName());

            // Jika nama belakang sama, bandingkan berdasarkan nama depan
            if (result == 0) {
                result = this.firstName.compareTo(otherSalesperson.getFirstName());
            }
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
