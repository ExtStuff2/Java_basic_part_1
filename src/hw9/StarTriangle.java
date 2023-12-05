package hw9;

import java.util.Arrays;

public class StarTriangle {
    private int width;
    private String[] triangle;
    private String triangleResult = "";

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "StarTriangle{" +
                "width=" + width +
                "}" + "\n"
                + getTriangle();
    }

    private String getTriangle() {
        triangle = new String[width];
        triangle[0] = "[*]";
        for (int i = 1; i < width; i++) {
            triangle[i] = triangle[i - 1] + "[*]";
        }
        for (String row : triangle) {
            triangleResult += row + "\n";
        }
        return triangleResult;
    }
}
