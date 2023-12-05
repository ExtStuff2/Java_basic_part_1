package hw9;

public class Rectangle {
    public double getRecArea(double a) {
        //A = a × b
        return a * a;

    }

    public double getRecPerimeter(double a) {
        //P = 2 × (a + b)
        return 2 * a * a;

    }

    public double getRecDiagonal(double a) {
        //d = √(a² + b²)
        return Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2));
    }

}
