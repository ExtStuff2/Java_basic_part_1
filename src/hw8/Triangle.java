package hw8;

public class Triangle {
    private double a, b, c, perimeter, area;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String printAreaPerimeter() {
        //for area (heron formula)
        area = 0.25 * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
        perimeter = a + b + c;
        return " Area ->> " + area + " Perimeter ->> " + perimeter;

    }
}
