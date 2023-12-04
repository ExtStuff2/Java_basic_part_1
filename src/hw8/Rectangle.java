package hw8;

import java.util.Objects;

public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int returnArea() {
        //formula ->> Rectangle area = a*b
        return width * height;
    }

    @Override
    public String toString() {
        return width + " " + height;
    }

    @Override
    public boolean equals(Object o) {
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    protected Object clone() {
        return new Rectangle(width, height);
    }
}
