package hw12;

public class LeetCodeTasks {

    public String restoreString(String s, int[] indices) {
        char[] resultArray = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            resultArray[indices[i]] = s.charAt(i);
        }

        return new String(resultArray);
    }

    public int getNumberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num--;
            } else {
                num = num / 2;
            }
            steps++;
        }
        return steps;
    }

    public boolean getArrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (String s : word1) {
            s1 += s;
        }
        for (String s : word2) {
            s2 += s;
        }
        return s1.equals(s2);
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j += 2) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }

    public boolean isPalindrome(int x) {
        boolean result = true;
        String str = Integer.toString(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
