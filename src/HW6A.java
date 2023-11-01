import java.util.Arrays;

public class HW6A extends HW6 {
    //task 6 a 1, task 6 a 2 etc
    public String getElemCoords(int elem, int[][] array) {
        String elemCoords = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == elem) {
                    elemCoords = i + " " + j;
                }
            }
        }
        return elemCoords;
    }

    public String getAverageValue(int[][] array) {
        String avgValue = "";

        for (int i = 0; i < array.length; i++) {
            avgValue += "\nRow index ->> " + i
                    + " average value ->> "
                    + getAverageValue(array[i]);
        }
        return avgValue;
    }

    public int[] getOneDArray(int[][] array) {
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

        return oneDVersion;
    }

    public int[][] getSortedElem(int[][] array) {
        int[] lengthArray = new int[array.length];
        int[][] resultArraySecond = new int[array.length][];
        String[] duplicatesLength;
        String[] duplicatesNewIndexArray;
        String[] duplicatesLengthArrayIndex;
        String duplicatesOrigIndex = "";


        for (int i = 0; i < array.length; i++) {
            lengthArray[i] = array[i].length;
        }

        lengthArray = getBubbleSort(lengthArray);

        //duplicates_section
        duplicatesLength = getArrayDuplicates(lengthArray).split(",");

        for (int i = 0; i < duplicatesLength.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Integer.parseInt(duplicatesLength[i]) == array[j].length) {
                    duplicatesOrigIndex += j + " ";
                }
            }
        }
        duplicatesNewIndexArray = duplicatesOrigIndex.split(" ");
        duplicatesOrigIndex = "";

        for (int i = 0; i < duplicatesLength.length; i++) {
            for (int j = 0; j < lengthArray.length; j++) {
                if (Integer.parseInt(duplicatesLength[i]) == lengthArray[j]) {
                    duplicatesOrigIndex += j + " ";
                }
            }
        }
        duplicatesLengthArrayIndex = duplicatesOrigIndex.split(" ");
        //duplicates_section

        //first_sort
        for (int i = 0; i < lengthArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (lengthArray[i] == array[j].length) {
                    resultArraySecond[i] = array[j];
                }

            }
        }
        //first_sort

        //final swap for duplicates
        for (int i = 0; i < duplicatesLengthArrayIndex.length; i++) {
            resultArraySecond[Integer.parseInt(duplicatesLengthArrayIndex[i])] = array[Integer.parseInt(duplicatesNewIndexArray[i])];
        }

        //sort array values
        for(int i=0;i<resultArraySecond.length;i++)
        {
            if(resultArraySecond[i].length>1)
            {
                resultArraySecond[i] = getBubbleSort(resultArraySecond[i]);
            }
        }

        return resultArraySecond;
    }

    public String getMinMaxElem(int[][] array) {
        String result;
        int[][] sortedArray = getSortedElem(array);
        result = "Min ->> " + Arrays.toString(sortedArray[0]) + " max ->> " + Arrays.toString(sortedArray[sortedArray.length - 1]);
        return result;
    }

    public String getMinMaxValue(int[][] array) {
        String result;
        int[] oneDArray = getOneDArray(array);
        oneDArray = getBubbleSort(oneDArray);
        result = "Min ->> " + oneDArray[0] + " max ->> " + oneDArray[oneDArray.length - 1];
        return result;
    }

    public boolean getMatrixSymmetry(int[][] matrix) {
        //the condition a[i,j]=a[j,i] for all elements of the matrix must be satisfied
        boolean symmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        return symmetric;
    }

    public int[] getInvertedArray(int[] array) {
        int[] invertedArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            invertedArray[j - 1] = array[i];
            j = j - 1;
        }
        return invertedArray;
    }

    public int[][] getInvertedMatrix(int[][] matrix) {
        int[][] resultMatrix = getRowColumnChange(matrix);

        for (int i = 0; i < resultMatrix.length; i++) {
            resultMatrix[i] = getInvertedArray(resultMatrix[i]);
        }
        return resultMatrix;
    }

    public static void main(String[] args) {

        HW6A hw6A = new HW6A();

        //task 6 a 1
        System.out.println(hw6A.getElemCoords(60, new int[][]{{10, 20, 30}, {40, 50, 60}}));

        //task 6 a 2
        System.out.println(hw6A.getAverageValue(new int[][]{{10, 20, 30}, {40, 50, 60}}));

        //task 6 a 3
        System.out.println(Arrays.deepToString(hw6A.getRowColumnChange(new int[][]{{10, 20, 30}, {40, 50, 60}})));

        System.out.println(Arrays.deepToString(hw6A.getRowColumnChange(new int[][]{{10, 40}, {20, 50}, {30, 60}})));

        //task 6 a 4
        System.out.println(hw6A.getMinMaxElem(new int[][]{
                {10, 20, 30},
                {10, 20, 50},
                {10, 20, 30, 20},
                {10, 20, 30, 80, 50},
                {10},
                {40}}));
        System.out.println(hw6A.getMinMaxValue(new int[][]{
                {10, 20, 30},
                {10, 20, 50},
                {10, 20, 30, 20},
                {10, 20, 30, 80, 50},
                {10},
                {40}}));
        //task 6 a 5
        System.out.println("From min to max ->> " + Arrays.deepToString(hw6A.getSortedElem(new int[][]{
                {10, 20, 30},
                {10, 20, 50},
                {10, 20, 30, 20, 20, 20},
                {10, 20, 30, 80},
                {10},
                {40},
                {50},
                {80},
                {10, 20, 30, 20, 10},
                {50, 40}})));
        //task 6 a 6
        System.out.println("Is this matrix symmetric ->> " + hw6A.getMatrixSymmetry(new int[][]{
                {1, 2, -1},
                {2, 1, 3},
                {-1, 3, 0},
        }));
        //task 6 a 7
        System.out.println(Arrays.deepToString(hw6A.getInvertedMatrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6}})));

    }
}
