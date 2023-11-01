public class HW5A {
    //hw 5 additional task 1 etc
    public void getEvenOdd(int number) {
        if (number % 2 == 0)
            System.out.println("Your number ->> " + number + " is even");
        else
            System.out.println("Your number ->> " + number + " is odd");
    }

    public void getBiggerNumber(int number1, int number2) {

        System.out.println("Number1 " + number1 + " is bigger than number2 " + number2 + "->>" + (number1 > number2)
                + "\n" + "Number1 " + number1 + " is smaller than number2 " + number2 + "->>" + (number1 < number2)
                + "\n" + "Number1 " + number1 + " is equal to number2 " + number2 + "->>" + (number1 == number2));
    }

    public void getLeapYear(int year) {
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

    public void getWeekDay(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                System.out.println("Type number from 1 to 7");
        }
        System.out.println(dayOfWeek);
    }

    public void getQuadrant(int xCord, int yCord) {
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

    public void getTriangleType(int a, int b, int c) {
        //all cases
        System.out.println("Triangle with a=" + a + " b=" + b + " c=" + c + "\nis Equilateral (all 3 sides same size) ->> " + (a == b && b == c) +
                "\nis Isosceles (2 sides are same size) ->> " + (a == b || b == c || c == a) +
                "\nis Scalene (no sides are same size) ->> " + (a != b && b != c));
    }

    public static void main(String[] args) {
        HW5A hw5A = new HW5A();
        //task 5 a 1
        hw5A.getEvenOdd(4);
        //task 5 a 2
        hw5A.getBiggerNumber(4, 3);
        //task 5 a 3
        hw5A.getLeapYear(2049);
        //task 5 a 4
        hw5A.getWeekDay(1);
        //task 5 a 5
        hw5A.getQuadrant(1, -1);
        //task 5 a 6
        hw5A.getTriangleType(4, 2, 3);
    }
}
