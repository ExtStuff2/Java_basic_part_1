public class HW7 extends HW6 {

    public int getVowelsNum(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'A')
                    || (str.charAt(i) == 'e' || str.charAt(i) == 'E')
                    || (str.charAt(i) == 'i' || str.charAt(i) == 'I')
                    || (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                    || (str.charAt(i) == 'u' || str.charAt(i) == 'U')) {
                count++;
            }
        }
        return count;
    }

    public boolean isAllVowels(String str) {
        boolean result = false;
        if (getVowelsNum(str) == str.length()) {
            result = true;
        }
        return result;
    }

    public int getWordsNum(String str) {
        return str.split(" +").length;
    }

    public int getNumberOfTwo(int num) {
        int count = 0;
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == '2') {
                count++;
            }
        }
        return count;
    }

    public double getPentagonArea(int sidesNum, int sideLength) {
        //formula ->> area = a² × √(25 + 10√5) / 4  (a - side length)
        return ((sideLength * sideLength * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4);
    }

    public int getNumSum(int num) {
        int result = 0;
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length(); i++) {
            result += Character.getNumericValue(numString.charAt(i));
        }
        return result;

    }

    public static void main(String[] args) {
        HW7 hw7 = new HW7();
        //Task 7 1
        int[] array = {25, 37, 29};
        System.out.println("1 num ->>" + array[0] + " 2 num ->> " + array[1] + " 3 num ->> " + array[2]);
        System.out.println("Min value ->>" + hw7.getBubbleSort(array)[0]);
        //Task 7 2
        System.out.println("Average value ->> " + hw7.getAverageValue(new int[]{25, 45, 65}));
        //Task 7 3
        System.out.println("Vowel number ->>" + hw7.getVowelsNum("DarTech123"));
        //Task 7 4
        System.out.println("Words num ->>" + hw7.getWordsNum("Java is good to learn Object Oriented programming."));
        //Task 7 5
        System.out.println("Number of occurrences 2 in num ->>" + hw7.getNumberOfTwo(1254212));
        //Task 7 6
        System.out.println("All vowels ->>" + hw7.isAllVowels("AIEEE"));
        //Task 7 7
        System.out.println(("Pentagon area ->> " + hw7.getPentagonArea(5, 6)));
        //Task 7 8
        System.out.println("Num sum ->> " + hw7.getNumSum(252));
    }
}
