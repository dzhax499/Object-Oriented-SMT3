
public class Fulltime extends Employee {

    private int tunjanganJabatan;
    private int tunjanganKomunikasi = 500000;
    private int tunjanganAnak;
    private int lemburJam;
    private Koperasi koperasi;

    public Fulltime(String name, String position, Department departemen, int anak, int lemburJam, Koperasi koperasi) {
        super(name, position, departemen);
        setTunjanganJabatan();
        setTunjanganAnak(anak);
        this.lemburJam = lemburJam;
        this.koperasi = koperasi;
    }

    private void setTunjanganJabatan() {
        switch (getPosition().toLowerCase()) {
            case "manager":
                tunjanganJabatan = 5000000;
                break;
            case "programmer":
                tunjanganJabatan = 2000000;
                break;
            case "analis":
                tunjanganJabatan = 3000000;
                break;
            default:
                tunjanganJabatan = 0;
        }
    }

    private void setTunjanganAnak(int anak) {
        tunjanganAnak = Math.min(anak, 2) * 500000;
    }

    private int getTunjanganLembur() {
        return lemburJam * 30000;
    }

    @Override
    public int getSalary() {
        return getBaseSalary()
                + getTunjanganLembur()
                + tunjanganJabatan
                + tunjanganAnak
                + tunjanganKomunikasi
                - koperasi.getLoanMonthly();
    }
}
