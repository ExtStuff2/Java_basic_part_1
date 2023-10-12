public class HW3_3 {
    public static void main(String[] args) {
        //Task_3_3
        //Implicit casting example
        //byte -> short -> int -> long -> float -> double
        byte a = 1;
        short b = a;
        long c = b;
        float d = c;
        double e = d;

        //Explicit casting example
        //double -> float -> long -> int -> short -> byte
        double ab = 1.0;
        float bc = (float) ab;
        long cd = (long) bc;
        int de = (int) cd;
        short ef = (short) de;
        byte fg = (byte) ef;
    }
}
