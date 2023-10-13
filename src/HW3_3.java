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
        double aB = 1.0;
        float bC = (float) aB;
        long cD = (long) bC;
        int dE = (int) cD;
        short eF = (short) dE;
        byte fG = (byte) eF;
    }
}
