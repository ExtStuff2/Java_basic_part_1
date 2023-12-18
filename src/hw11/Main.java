package hw11;

public class Main {
    public static void main(String[] args) {

        //task 11 1
        System.out.println(TryCatchFuncs.getNumberSqrt(36));

        //task 11 2
        System.out.println(TryCatchFuncs.divide(20, 0));

        //task 11 3
        System.out.println("Sum ->> " + TryCatchFuncs.elemFromStringSum("10 20.5 30 40"));

        System.out.println("Sum ->> " + TryCatchFuncs.elemFromStringSum("10 random 30 cat"));
    }

}
