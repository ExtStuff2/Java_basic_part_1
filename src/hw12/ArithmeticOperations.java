package hw12;

import java.util.Arrays;

public class ArithmeticOperations {

    public void getSumDivSubModOfTwoNums(int a, int b) {
        System.out.println("Sum ->> " + (a + b));
        System.out.println("Multiplication ->> " + a * b);
        System.out.println("Subtraction ->> " + (a - b));
        System.out.println("Division ->> " + a / b);
        System.out.println("Remainder ->> " + a % b);
    }

    public void getOddNumbersInRange(int range) {
        for (int i = 1; i <= range; i++) {
            if (i % 2 != 0) {
                System.out.println("Number ->> " + i + " is odd");
            }
        }
    }

    public void getSwapTwoVars(int a, int b) {
        a = a ^ b; // A := A XOR B
        b = a ^ b; // B := A XOR B
        a = a ^ b; // A := A XOR B
        System.out.println("a->> " + a + " b->> " + b);
    }

    public void getMaxOutOfThreeNums(int a, int b, int c) {
        System.out.println("Max out of three nums ->> " + (Math.max(Math.max(a, b), Math.max(c, b))));
    }

    public void getNumPositiveOrNegative(int num) {
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }
    }

    public void replaceCharAToB(String input) {
        String result = input.replace("a", "b");
        System.out.println(result);
    }

    public int getArrayMembersSum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public int getSecondMaxFromArray(int[] array) {
        return Arrays.stream(array).sorted().skip(1).findFirst().getAsInt();
    }
}
