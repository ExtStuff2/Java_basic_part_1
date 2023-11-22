package hw8;

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
}
