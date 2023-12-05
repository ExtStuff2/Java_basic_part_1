package hw8;

public class Main {
    public static void main(String[] args) {
        //task 8 1
        Student alice = new Student("Alice", "Smith", "Koktem-2", 24);
        Student azamat = new Student("Azamat", "Smith", "Koktem-22", 241);
        Student kristina = new Student("Christy", "Smith", "Koktem-222", 242);

        System.out.println(alice);
        System.out.println(azamat);
        System.out.println(kristina);

        //task 8 2
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.printAreaPerimeter());

        //task 8 3
        Rectangle rectangle = new Rectangle(5, 9);
        Rectangle rectangle1 = new Rectangle(10, 14);

        System.out.println(rectangle.returnArea());
        System.out.println(rectangle1.returnArea());

        //task 8 4
        Average average = new Average();
        average.printAverage(new double[]{10, 5, 15.2});

        //task 8 5
        Movie instance1 = new Movie("Focus", "RatPac...", "R");
        Movie instance2 = new Movie("Another name", "20th Century...");

        //Task 8_2 1
        System.out.println("Static == same for all ->> " + instance1.equals(instance2));
        System.out.println("New hashcode ->>" + instance1.hashCode());

        //deep clone
        System.out.println(instance1.clone() == instance1);

        //shallow clone
        Movie instance3 = instance1;
        System.out.println(instance3 == instance1);

        Average average1 = (Average) average.clone();
        System.out.println(average1==average);
    }

}