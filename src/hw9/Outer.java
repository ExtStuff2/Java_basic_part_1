package hw9;

public class Outer {
    private int number;

    public Outer(int number) {
        this.number = number;
    }

    class Inner {
        void innerMethod() {
            number += 1;
            System.out.println("Number= " + number);
        }
    }
}
