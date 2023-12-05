package hw9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 9.1
        Student student = new Student("Karl", 1920);
        student.setYear(1921);
        System.out.println(student.getYear());

        //task 9.2
        StarTriangle starTriangle = new StarTriangle(3);
        System.out.println(starTriangle);

        //task 9.3
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area ->> " + rectangle.getRecArea(scanner.nextDouble()));

        //task 9.4
        Temperature temperature = new Temperature(53, 'F');
        System.out.println(temperature.getDegreesF());
        System.out.println(temperature.getDegreesC());

        //task 9-2 1
        Outer.Inner in = new Outer(5).new Inner();
        in.innerMethod();

        //task 9-2 2
        Vehicle vehicle = new Vehicle(20);
        vehicle.start();

        //task 9-2 3
        Book.Description description = new Book("Title").new Description();
        System.out.println(description.getBookDescription());

    }
}
