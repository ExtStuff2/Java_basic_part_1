package hw10;

public class Student {
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }

    public int getGrade() {
        return grade;
    }
}
