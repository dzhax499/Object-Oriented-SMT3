public class Parttime extends Employee {

    private int lemburJam;

    public Parttime(String name, String position, Department departemen, int lemburJam) {
        super(name, position, departemen);
        this.lemburJam = lemburJam;
    }

    private int getTunjanganLembur() {
        return lemburJam * 30000;
    }

    @Override
    public int getSalary() {
        return getBaseSalary() + getTunjanganLembur();
    }
}
