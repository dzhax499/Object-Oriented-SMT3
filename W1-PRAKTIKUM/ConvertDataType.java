// Soal 4: Operators(1)
class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;
        return (short)i;
    }
    
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println("Nilai d: " + d);
        System.out.println("Nilai f: " + f);
        System.out.println("Nilai b: " + b);
    }
}