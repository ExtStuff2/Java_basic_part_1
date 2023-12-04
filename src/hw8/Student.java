package hw8;

import java.util.Objects;

public class Student {
    private String name, surname, address;
    private int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + address + " " + id;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return id == student.id && student.toString().equals(this.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, id);
    }

    @Override
    protected Object clone() {
        return new Student(name, surname, address, id);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
