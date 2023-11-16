import java.util.Arrays;

public class HW7A extends HW6 {
    //task 7 a 1, task 7 a 2 etc
    public int findMax(int[] array) {
        int[] result = getBubbleSort(array);

        return result[result.length - 1];
    }

    public String formatTime(int seconds) {
        return String.format("HH : mm : ss ->> %d:%02d:%02d",
                seconds / 3600,
                (seconds % 3600) / 60,
                (seconds % 60));
    }

    public boolean isPalindrome(String str) {
        boolean result = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public int findGCD(int a, int b) {
        //Euclidean alg implementation for finding gcd
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return findGCD(a - b, b);
        return findGCD(a, b - a);
    }

    public void printArray(int[] array) {
        for (int x : array) {
            System.out.println(x);
        }
    }

    public void printArray(double[] array) {
        for (double x : array) {
            System.out.println(x);
        }
    }

    public void printArray(char[] array) {
        for (char x : array) {
            System.out.println(x);
        }
    }

    public boolean getLeapYear(int year) {
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        return leap;

    }

    public int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;

        if (month >= 1 && month <= 12)
            if (year > 1 && year <= 9999)
                if (getLeapYear(year)) {
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        daysInMonth = 31;
                    } else if (month == 2) {
                        daysInMonth = 29;
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        daysInMonth = 30;
                    }
                } else if (!getLeapYear(year)) {
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        daysInMonth = 31;
                    } else if (month == 2) {
                        daysInMonth = 28;
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        daysInMonth = 30;
                    }
                }
        return daysInMonth;
    }

    public double getDistance(double[] coords) {
        //The distance between two points formula derived from the Pythagorean Theorem
        //formula ->> math.sqrt( (x2 - x1)^2 + (y2 - y1)^2)
        double distance = 0;

        if (coords.length == 4) {
            distance = Math.sqrt(Math.pow((coords[2] - coords[0]), 2) + Math.pow((coords[3] - coords[1]), 2));
        }
        return distance;
    }

    //Recursion part
    public void printIntAscendingOrder(int n) {
        if (n > 1) {
            printIntAscendingOrder(n - 1);
        }
        System.out.println(n);
    }

    public int getFibonacciRec(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        } else {
            return getFibonacciRec(num - 1) + getFibonacciRec(num - 2);
        }
    }

    public int[] saveFibonacciRecResult(int num) {
        int[] fibonacciResult = new int[num];

        for (int i = 0; i < num; i++) {
            fibonacciResult[i] = getFibonacciRec(i);
        }

        return fibonacciResult;
    }

    public int getPowRec(int x, int n) {
        if (n != 0)
            return (x * getPowRec(x, n - 1));
        else
            return 1;
    }

    public int getMaxRec(int[] array, int length) {
        if (length == 1)
            return array[0];

        return Math.max(array[length - 1], getMaxRec(array, length - 1));
    }

    public int getSumOfArrayElements(int[] array, int length) {
        if (length <= 0)
            return 0;
        return (getSumOfArrayElements(array, length - 1) + array[length - 1]);
    }


    public static void main(String[] args) {
        HW7A hw7A = new HW7A();

        //Task 7 a 1
        System.out.println("Max value ->>" + hw7A.findMax(new int[]{25, 45, 65}));

        //Task 7 a 2
        System.out.println("Time formatted ->>" + hw7A.formatTime(72360));

        //Task 7 a 3
        System.out.println("String ->> " + "abcddcba" + " is palindrome ->>" + hw7A.isPalindrome("abcddcba"));

        //Task 7 a 4
        System.out.println("Gcd of numbers ->>" + 54 + "," + 24 + " is ->> " + hw7A.findGCD(54, 24));

        //Task 7 a 5
        hw7A.printArray(new int[]{25, 45, 65});
        hw7A.printArray(new double[]{25.1, 45.2, 65.1});
        hw7A.printArray(new char[]{'2', '4', '6'});

        //Task 7 a 6
        System.out.println(hw7A.getDaysInMonth(2, 2023));

        //Task 7 a 7
        System.out.println("Distance between two points ->> " + hw7A.getDistance(new double[]{1, 1, 4, 4}));

        //Recursion part ->> Task 7 a1 1
        hw7A.printIntAscendingOrder(5);

        //Task 7 a1 2
        System.out.print("Fibonacci loop version ->> ");
        hw7A.getFibonacci(10);
        System.out.print("Fibonacci recursion version ->> ");
        System.out.println(Arrays.toString(hw7A.saveFibonacciRecResult(10)));

        //Task 7 a1 3
        System.out.println("Pow using recursion ->> " + hw7A.getPowRec(2, 4));

        //Task 7 a1 4
        System.out.println("Max element in array ->> " + hw7A.getMaxRec(new int[]{25, 91, 65, 20}, 4));

        //Task 7 a1 5
        System.out.println("Sum of array elements ->> " + hw7A.getSumOfArrayElements(new int[]{2, 5, 1}, 3));
    }
}
