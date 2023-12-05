package hw8;

import java.util.Arrays;

public class Average {
    private double sum;

    @Override
    public boolean equals(Object o) {
        Average average = (Average) o;
        return average.sum == sum;
    }

    @Override
    public int hashCode() {
        return (int) Math.pow(16, this.sum);
    }

    @Override
    public String toString() {
        return " " + sum;
    }

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

    @Override
    protected Object clone() {
        return this;
    }
}
