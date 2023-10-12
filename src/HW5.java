public class HW5 {
    private char gradeLetter;
    private String positiveNumberString;
    public void task51(int length, int width)
    {
        if(length==width){System.out.println("Length ->> " + length + " == " + "Width ->> " + width + " ->> it is square");}
        else {System.out.println("It isn't square");}
    }
    public void task52(int price) {
        if(price > 4999){System.out.println(" Your price bigger than 5000 or equal ->> " + price + " you get a 10% discount, your final price ->> " + (price - price*0.1) );}
        else if(price<5000){System.out.println(" Your final price is ->> " + price);}
    }

    public void task53(int gradeNumber) {
        if (gradeNumber<81 && gradeNumber>59){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='B'));}
        else if (gradeNumber>80) {System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='A'));}
        else if (gradeNumber<61 && gradeNumber>49){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='C'));}
        else if (gradeNumber<49 && gradeNumber>44){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='D'));}
        else if (gradeNumber<46 && gradeNumber>24){System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='E'));}
        else if (gradeNumber<25) {System.out.println("Your grade number ->> " + gradeNumber + " your grade letter ->> " + (gradeLetter='F'));}
    }

    public void task54(int positiveNumber)
    {
        positiveNumberString = "";
        for (int i = 0;i < Integer.toString(positiveNumber).length(); i++)
        {
            positiveNumberString +=Integer.toString(positiveNumber).charAt(Integer.toString(positiveNumber).length()-(i+1));

        }
        System.out.println("Your number is ->> " + positiveNumber + " in reverse ->> " + positiveNumberString);

    }
    public void task55(int numberForCheck)
    {
        boolean check = false;
        for (int i = 2; i <= numberForCheck / 2; ++i) {
            if (numberForCheck % i == 0) {
                check = true;
                break;
            }
        }
        if (!check) {System.out.println(numberForCheck + " is a prime number.");}
        else {System.out.println(numberForCheck + " is not a prime number.");}
    }

    public static void main(String[] args) {
        HW5 hw5 = new HW5();
        //task 5_1
        hw5.task51(2, 2);
        //task 5_2
        hw5.task52(5500);
        //task 5_3
        hw5.task53(60);
        //task 5_4
        hw5.task54(12345);
        //task 5_5
        hw5.task55(5);
    }
}
