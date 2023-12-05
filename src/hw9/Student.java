package hw9;

public class Student {
    private String name;
    private int id, year;
    public static int counter = 0;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > this.year) {
            this.year = year;
        }
    }
}
