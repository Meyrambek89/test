package org.example;

public class Car {
    private String name;
    private int year;
    public Car() {}
    public Car(String name,int year) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
