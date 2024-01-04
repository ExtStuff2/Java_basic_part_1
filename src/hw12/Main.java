package hw12;

public class Main {
    public static void main(String[] args) {

        //task 12 2
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        arithmeticOperations.getSumDivSubModOfTwoNums(4, 2);

        //task 12 3
        arithmeticOperations.getOddNumbersInRange(20);

        //task 12 4
        arithmeticOperations.getSwapTwoVars(4, 2);

        //task 12 5
        arithmeticOperations.getMaxOutOfThreeNums(9, 7, 1);

        //task 12 6
        arithmeticOperations.getNumPositiveOrNegative(9);

        //task 12 7
        arithmeticOperations.replaceCharAToB("adffal");

        //task 12 8
        System.out.println("Sum ->> " + arithmeticOperations.getArrayMembersSum(new int[]{2, 45, 3}));

        //task 12 9
        System.out.println("Second max ->> " + arithmeticOperations.getSecondMaxFromArray(new int[]{5, 45, 2}));

        //task 12 10
        LeetCodeTasks leetCodeTasks = new LeetCodeTasks();
        System.out.println("Shuffled string ->>" +
                leetCodeTasks.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));

        //task 12 11
        System.out.println(leetCodeTasks.isPalindrome(10));

        //task 12 12
        System.out.println("Number of steps ->> " + leetCodeTasks.getNumberOfSteps(14));

        //task 12 13
        System.out.println("String are equal ->>" + leetCodeTasks.getArrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));

        //task 12 14
        System.out.println(leetCodeTasks.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));

    }
}
