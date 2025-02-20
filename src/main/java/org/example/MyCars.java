package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MyCars {
    private String name;
    private String color;
    private Car car;

    public MyCars() {}

    @Autowired
    public MyCars(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

