import java.util.Arrays;

public class HW6 extends HW5 {
    public float getAverageValue(int[] array) {
        float averageValue = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                averageValue += array[i];
            }
            averageValue /= array.length;
        } else {
            System.out.println("Enter array with length>0");
        }

        return averageValue;
    }

    public String getArrayDuplicates(int[] array) {
        String duplicates = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    duplicates += array[j] + ",";
            }
        }
        return duplicates;
    }

    public boolean getNumberOccurrence(int[] array, int number) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        if (index < 0) {
            return false;
        }
        return true;
    }

    public int getNumberIndex(int[] array, int number) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        if (index < 0) {
            System.out.println("If index < 0 ->> index not found");
        }
        return index;
    }

    public int[] getSubArray(int[] array, int start, int end) {
        int[] subArray = new int[end - start + 1];

        for (int i = start; i < end + 1; i++) {
            subArray[(i) - start] = array[i];
        }
        return subArray;
    }

    public void getMaxMin(int[] array) {
        int min, max;
        min = max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("Min and max: " + min + " and " + max);
    }

    public int[] getBubbleSort(int[] array) {
        int temp = 0;

        //bubble sort algorithm
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public String getSecondMin(int[] array) {
        int[] sortedArray = getBubbleSort(array);

        return "First min ->> " + sortedArray[0] + " Second min ->> " + sortedArray[1];
    }

    public String getMaxSorted(int[] array) {
        int[] sortedArray = getBubbleSort(array);

        String result = Arrays.toString(sortedArray)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");

        return getReverseArgument(result);
    }

    public int[][] getRowColumnChange(int[][] array) {
        int[][] resultArray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                resultArray[j][i] = array[i][j];
            }
        }

        return resultArray;
    }

    public int getArraySum(int[][] array) {
        int sum = 0;
        for (int[] x : array) {
            for (int y : x) {
                sum += y;
            }
        }
        return sum;
    }

    public boolean isArraySquare(int[][] array) {
        int rowCount = array.length;
        boolean squareCheck = false;

        for (int[] x : array) {
            if (x.length == rowCount) {
                squareCheck = true;
            }
        }
        return squareCheck;
    }

    public int[][] getMultiplicationTable(int n) {
        int[][] multiplicationTable = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiplicationTable;

    }

    public void getMinMaxVersion(int[][] array) {
        int arrayLength = 0;
        String allValues = "";
        String[] allValuesStr;

        for (int i = 0; i < array.length; i++) {
            arrayLength += array[i].length;
        }

        int[] oneDVersion = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                allValues += array[i][j] + " ";
            }
        }

        allValuesStr = allValues.split(" ");

        for (int i = 0; i < oneDVersion.length; i++) {
            oneDVersion[i] = Integer.parseInt(allValuesStr[i]);
        }
        oneDVersion = getBubbleSort(oneDVersion);
        System.out.println("Min value ->> " + oneDVersion[0] + " max value ->> " + oneDVersion[oneDVersion.length - 1]);
    }

    public static void main(String[] args) {
        HW6 hw6 = new HW6();

        //task 6_1
        System.out.println(hw6.getAverageValue(new int[]{1, 3, 4, 1, 5, 5}));

        //task 6_2
        System.out.println("Duplicates ->> " + hw6.getArrayDuplicates(new int[]{1, 3, 4, 1, 5, 5}));

        //task 6_3
        System.out.println(hw6.getNumberOccurrence(new int[]{1, 3, -6, 23, 14, 2}, 23));

        System.out.println(hw6.getNumberOccurrence(new int[]{1, 3, -6, 23, 14, 2}, 0));

        //task 6_4
        System.out.println("Index of " + 23 + " is ->> " + hw6.getNumberIndex(new int[]{1, 3, -6, 23, 14, 2}, 23));

        System.out.println("Index of " + 5 + " is ->> " + hw6.getNumberIndex(new int[]{1, 3, -6, 23, 14, 2}, 5));

        //task 6_5
        System.out.println("Sub array ->> " + Arrays.toString(hw6.getSubArray(new int[]{34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7}, 3, 8)));

        System.out.println("Sub array ->> " + Arrays.toString(hw6.getSubArray(new int[]{1, 3, -6, 23, 14, 2}, 1, 3)));

        //task 6_6
        hw6.getMaxMin(new int[]{1, 3, -6, 23, 14, 2});

        //task 6_7
        System.out.println(hw6.getSecondMin(new int[]{1, 3, -6, 23, 14, 2}));

        //task 6_8
        System.out.println(hw6.getMaxSorted(new int[]{1, 2, 3, 0, 4, 6}));

        //task 6_9
        System.out.println(Arrays.deepToString(hw6.getRowColumnChange(new int[][]{{10, 20, 30}, {40, 50, 60}})));

        System.out.println(Arrays.deepToString(hw6.getRowColumnChange(new int[][]{{4, 2, 1}, {2, 7, 2}})));

        //task 6_10
        System.out.println("Sum ->> " + hw6.getArraySum(new int[][]{{10, 20, 30}, {40, 50, 60}}));

        //task 6_11
        System.out.println("Your array is square ->> " + hw6.isArraySquare(new int[][]{{10, 20, 30}, {40, 50, 60}}));

        System.out.println("Your array is square ->> " + hw6.isArraySquare(new int[][]{{10, 20}, {40, 50}}));

        //task 6_12
        System.out.println(Arrays.deepToString(hw6.getMultiplicationTable(5)));

        //task 6_13
        hw6.getMinMaxVersion(new int[][]{{10, 20, 30}, {40, 50, 60}});
    }
}
