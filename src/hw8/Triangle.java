package hw8;

import java.util.Objects;

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

    @Override
    public String toString() {
        return a + " " + b + " " + c + " " + perimeter + " " + area;
    }

    @Override
    public boolean equals(Object o) {
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, perimeter, area);
    }

    @Override
    protected Object clone() {
        return new Triangle(a,b,c);
    }
}
