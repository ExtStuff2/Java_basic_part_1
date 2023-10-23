public class HW5A {
    //hw 5 additional task 1 etc
    public void task5A1(int number)
    {
        if (number%2==0)
            System.out.println("Your number ->> " + number + " is even");
        else
            System.out.println("Your number ->> " + number + " is odd");
    }
    public void task5A2(int number1, int number2)
    {
        System.out.println("Number1 " + number1 + " is bigger than number2 " + number2 + "->>" + (number1 > number2)
                + "\n" + "Number1 " + number1 + " is smaller than number2 " + number2 + "->>" + (number1 < number2)
                + "\n" + "Number1 " + number1 + " is equal to number2 " + number2 + "->>" + (number1 == number2));
    }
    public void task5A3(int year) {
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
        System.out.println("Year ->>" + year + " leap year ->> " + leap);

    }
    public void task5A4(int day) {
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Type number from 1 to 7");
        }
    }
    public void task5A5(int xCord, int yCord) {
        if (xCord == 0 && yCord == 0) System.out.println("Point (" + xCord + ";" + yCord + ") lies at the origin");
        else if (xCord > 0 && yCord == 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies between the first and fourth quadrant");
        else if (xCord < 0 && yCord == 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies between the second and third quadrant");
        else if (xCord == 0 && yCord > 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies between the first and second quadrant");
        else if (xCord == 0 && yCord < 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies between the third and fourth quadrant");
        else if (xCord > 0 && yCord > 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies in first quadrant");
        else if (xCord < 0 && yCord > 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies in second quadrant");
        else if (xCord < 0 && yCord < 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies in third quadrant");
        else if (xCord > 0 && yCord < 0)
            System.out.println("Point (" + xCord + ";" + yCord + ") lies in fourth quadrant");
    }
    public void task5A6(int a, int b, int c) {
        //all cases
        System.out.println("Triangle with a=" + a + " b=" + b + " c=" + c + "\nis Equilateral (all 3 sides same size) ->> " + (a == b && b == c) +
                "\nis Isosceles (2 sides are same size) ->> " + (a == b || b == c || c == a) +
                "\nis Scalene (no sides are same size) ->> " + (a != b && b != c));
    }

    public static void main(String[] args) {
        HW5A hw5A = new HW5A();
        //task 5 a 1
        hw5A.task5A1(4);
        //task 5 a 2
        hw5A.task5A2(4,3);
        //task 5 a 3
        hw5A.task5A3(2049);
        //task 5 a 4
        hw5A.task5A4(1);
        //task 5 a 5
        hw5A.task5A5(1, -1);
        //task 5 a 6
        hw5A.task5A6(4,2,3);
    }
}
