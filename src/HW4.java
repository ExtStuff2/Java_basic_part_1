public class HW4 {

    private int x, a, b, c, l, w;

    //task 4_1
    public void taskCompilation() {
        //Task_4_1
        System.out.println(10 * 5);
        //Task_4_2
        System.out.println(20 / 2.5);
        //Task_4_4
        x = 0;

        ++x;
        System.out.println(x);

        x = 0;

        x++;
        System.out.println(x);
        //Task_4_5
        System.out.println(x += 5);
        //Task_4_6
        System.out.println(25 == 43);
        //Task_4_9
        c = (Math.abs((10 + 451) / 3) + 5) * 5;

        System.out.println(c);
        //Task_4_10
        a = 65;
        b = 80;

        System.out.println(a < 50 && a < b);
    }

    //task 4_3
    public void getRectangleAreaAndPerimeter() {
        l = 15;
        w = 9;

        System.out.println("S = l*w ->> " + l * w);
        System.out.println("P = 2*(l+w) ->> " + (2 * (l + w)));
    }

    //task 4_7
    public void getBasicArithmeticOperations() {
        a = 10;
        b = 5;

        System.out.println("a+b ->> " + (a + b));
        System.out.println("a-b ->> " + (a - b));
        System.out.println("a*b ->> " + (a * b));
        System.out.println("a/b ->> " + (a / b));
        System.out.println("a%b ->> " + (a % b));
    }

    //task 4_8
    public void getTemperature(float fahr, float cels, char flag) {
        //if char == 'f' -> from fahrenheit to celsius
        if (flag == 'f') {
            System.out.println(" Celsius = (F (" + fahr + ") - 32)/1.80000 ->> " + (float) ((fahr - 32) / 1.8000));
        }
        //if char == 'c' -> from celsius to fahrenheit
        else if (flag == 'c') {
            System.out.println(" Fahrenheit = (C (" + cels + ") * 1.8000) + 32.00 ->> " + (float) ((cels * 1.8000) + 32.00));
        } else {
            System.out.println("flag can be either f for converting from fahrenheit to celsius or c for opposite");
        }
    }

    //task 4_9 as method
    public void getUselessMath(int o) {
        System.out.println((Math.abs((451 + 10) / 3) + 5) * 5);
    }

    //task 4_10 as method
    public void getLogicExample(int a, int b) {
        System.out.println(a < 50 && a < b);
    }

    public static void main(String[] args) {
        HW4 hw4 = new HW4();

        hw4.taskCompilation();
        hw4.getRectangleAreaAndPerimeter();
        hw4.getBasicArithmeticOperations();
        hw4.getTemperature(0, 20, 'c');
        hw4.getTemperature(68, 0, 'f');
        hw4.getTemperature(0, 0, 'd');
//        hw4.getUselessMath(10);
//        hw4.getLogicExample(65, 80);
    }
}
