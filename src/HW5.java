import java.util.ArrayList;
import java.util.List;

public class HW5 {
    public void squareCheck(int length, int width)
    {
        if(length==width){System.out.println("Length ->> " + length + " == " + "Width ->> " + width + " ->> it is square");}
        else {System.out.println("It isn't square");}
    }
    public void discountCalc(int price) {
        if(price > 4999){System.out.println(" Your price bigger than 5000 or equal ->> " + price + " you get a 10% discount, your final price ->> " + (price - price*0.1) );}
        else if(price>=0){System.out.println(" Your final price is ->> " + price);}
        else {System.out.println("Price must be positive");}
    }

    public void giveMeLetterGrade(int gradeNumber) {
        char gradeLetter;
        if (gradeNumber<81 && gradeNumber>59){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='B'));}
        else if (gradeNumber>80) {System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='A'));}
        else if (gradeNumber<61 && gradeNumber>49){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='C'));}
        else if (gradeNumber<49 && gradeNumber>44){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='D'));}
        else if (gradeNumber<46 && gradeNumber>24){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='E'));}
        else if (gradeNumber<25) {System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='F'));}
    }

    public void getReverseArgument(int positiveNumber)
    {
        String positiveNumberString = "";
        for (int i = 0;i < Integer.toString(positiveNumber).length(); i++)
        {
            positiveNumberString = positiveNumberString + Integer.toString(positiveNumber).charAt(Integer.toString(positiveNumber).length()-(i+1));

        }
        System.out.println("Your number is ->> " + positiveNumber + " in reverse ->> " + positiveNumberString);

    }
    public boolean primeCheck(int numberForCheck)
    {
        boolean check = false;
        for (int i = 2; i <= numberForCheck / 2; ++i) {
            if (numberForCheck % i == 0) {
                check = true;
                break;
            }
        }
        if (!check) {System.out.println(numberForCheck + " is a prime number.");}
        else {System.out.println(numberForCheck + " not a prime number.");}
        return check;
    }
    public void printThisMsg(String msg)
    {
        if (msg.equals("*"))
        {
            List<String> stringList = new ArrayList<String>();
            stringList.add("**********");
            String rowContent;
            //4 repeats for first raw
            for(int i = 0;i<4; i++)
            {
                System.out.println(stringList.get(0));
            }
            for(int i =0;i<5; i++)
            {
                System.out.println(stringList.get(0).substring(0, i+1));
            }
            //1)We assume that we have matrix with size m*n (m-rows, n-columns)
            //in that case ->> 5*10
            //2)Then cycle through all rows - at 0 row need to replace * to _ for further operations and concatenate result with 1
            //3)Then on next iteration(s) need to initialize variable to store string with !='_' chars from previous row (need to be cleared on every iteration)
            //4)Then in current row need to get chars from previous row in range (0;previousRowLength - (variableWithNon*Chars.length + 2))
            //and concatenate with stringCharsFromPreviousStringInAboveRange this formula ->> Int(currentRowNumber+1) + Str(variableWithNon*Chars) + Int(currentRowNumber+1)
            for(int row =0;row<5; row++)
            {
                if(row==0)
                {
                    stringList.set(row,stringList.get(row).substring(row,stringList.get(row).length() - (row+1)).replace("*","_") + (row+1));
                }
                else {
                    rowContent = "";
                    for(int index =0; index<stringList.get(row-1).length();index++)
                    {
                        if (stringList.get(row-1).charAt(index) != '_')
                        {
                            rowContent = rowContent + stringList.get(row-1).charAt(index);
                        }
                    }
                    stringList.add(stringList.get(row-1).substring(0,stringList.get(row-1).length()
                            - (rowContent.length() + 2))
                            + ((row+1) + rowContent + (row+1)));
                };
                System.out.println(stringList.get(row));
            }
        }
        else {
            System.out.println("Msg must be * to continue");
        }
    }
    public void giveMeSumInRange(int a, int b) {
        //Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.
        //Natural numbers are also known as counting numbers because they do not include zero or negative numbers
        //An efficient way to calculate the sum of natural numbers from 1 to 'n' is by using the formula (n * (n + 1)) / 2
        if (a > 0 && b > 0) {
            if (a > b) {
                giveMeSumInRange(b, a);
            } else {
                int element = b-a;
                //formula - >> (first * (element + 1)) + ((element) * (element + 1) / 2)
                int sum = (a*(element+1))+((element)*(element+1)/2);
                System.out.println("Your sum ->> " + sum + " in range (a;b) ->>" + "(" + a + ";" + b + ")");
            }
        }
        else
        {
            System.out.println("Enter positive nums in range");
        }
    }

    public void getMySalary(double salary, char rank){
        double bonus = 0;
        if(salary>=0) {
            if (rank == 'A') {
                bonus = 0.5;
                System.out.println("Employee with rank ->> " + rank + " bonus ->> " +
                        (bonus * 100) + " final salary ->> " + (salary + salary * bonus));
            } else if (rank == 'B') {
                bonus = 0.25;
                System.out.println("Employee with rank ->> " + rank + " bonus ->> " +
                        (bonus * 100) + " final salary ->> " + (salary + salary * bonus));
            } else if (rank == 'C') {
                bonus = 0;
                System.out.println("Employee with rank ->> " + rank + " bonus ->> " +
                        (bonus * 100) + " final salary ->> " + (salary + salary * bonus));
            } else {
                System.out.println("Your rank non-existent - it can be only A, B, C");
            }
        }
        else{System.out.println("Salary < 0");}
    }
    public void giveMeFibonacci(int n)
    {
        //The first number in the list of Fibonacci numbers is expressed as F0 = 0 and the second number in the list of Fibonacci numbers is expressed as F1 = 1.
        //Fibonacci sequence numbers follow a rule according to which, Fn = Fn-1 + Fn-2, where n > 1.
        //The third Fibonacci number is given as F2 = F1 + F0. As we know, F0 = 0 and F1 = 1, the value of F2 = 0 + 1 = 1.
        if (n > 0) {
            List<Integer> fiboList = new ArrayList<Integer>();
            fiboList.add(0);
            fiboList.add(1);
            for (int i = 2; i < n; i++) {
                fiboList.add(fiboList.get(i - 1) + fiboList.get(i - 2));
            }
            System.out.println(fiboList);
        } else System.out.println("Give positive argument");
    }
    public static void main(String[] args) {
        HW5 hw5 = new HW5();
        //task 5_1
        hw5.squareCheck(2, 2);
        //task 5_2
        hw5.discountCalc(5500);
        //task 5_3
        hw5.giveMeLetterGrade(60);
        //task 5_4
        hw5.getReverseArgument(12345);
        //task 5_5
        hw5.primeCheck(5);
        //task 5_6
        hw5.printThisMsg("*");
        //task 5_7
        hw5.giveMeSumInRange(2,4);
        //task 5_8
        hw5.getMySalary(100.25, 'A');
        //task 5_9
        hw5.giveMeFibonacci(9);
    }
}
