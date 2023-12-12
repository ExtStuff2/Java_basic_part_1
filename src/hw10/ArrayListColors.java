package hw10;

import java.util.ArrayList;

public class ArrayListColors {
    private ArrayList<String> colorsArrayList;

    public ArrayListColors() {
        this.colorsArrayList = new ArrayList<>();
    }

    public ArrayList<String> getColorsArrayList() {
        return colorsArrayList;
    }

    public void addColor(String color) {
        colorsArrayList.add(color);
    }

    public void removeColor(String color) {
        colorsArrayList.remove(color);
    }

    public void colorsPrinter(ArrayList<String> colors) {
        for (String color : colors) {
            System.out.println("Color ->> " + color);
        }
    }
}
