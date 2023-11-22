package hw8;

import java.util.Arrays;

public class Average {
    private double sum;

    public double getAverage(double[] array) {
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / array.length;
        return sum;
    }

    public double getAverage(double[] array, boolean flag) {
        return Arrays.stream(array).average().getAsDouble();
    }

    public void printAverage(double[] array) {
        System.out.println("Average custom method ->> " + getAverage(array));
        System.out.println("Average Arrays method ->>" + getAverage(array, true));
    }
}
