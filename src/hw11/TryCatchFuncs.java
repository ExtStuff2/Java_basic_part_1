package hw11;

public class TryCatchFuncs {
    //task 11 1
    public static double getNumberSqrt(double realNumber) {
        try {
            if (realNumber < 0) {
                throw new ArithmeticException("Error: Argument for square root must be positive");
            }
            double t;
            double sqrtroot = realNumber / 2;
            do {
                t = sqrtroot;
                sqrtroot = (t + (realNumber / t)) / 2;
            }
            while ((t - sqrtroot) != 0);

            return sqrtroot;
        } catch (Exception e) {
            System.out.println("Exception ->>" + e);
        }
        return -1;
    }

    //task 11 2
    public static double divide(double x, double y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Error: Argument y must be >0");
            }
            return x / y;
        } catch (Exception e) {
            System.out.println("Exception ->>" + e);
        }
        return -1;
    }

    //task 11 3
    public static double elemFromStringSum(String string) {
        try {
            double sum = 0;
            for (String elem : string.split(" ")) {
                sum += Double.parseDouble(elem);
            }
            return sum;

        } catch (NumberFormatException e) {
            System.out.println("Exception - you must enter only numbers ->> " + e);
        } catch (Exception e) {
            System.out.println("Exception ->> " + e);
        }
        return -1;
    }

}
