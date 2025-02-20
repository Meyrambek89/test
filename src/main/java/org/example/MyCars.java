package org.example;

public class MyCars {
    private final Car car;
    public MyCars(Car car) {
        this.car = car;
    }
    public void ShowCars() {
        System.out.println("My car is "+ car.getName());
    }
}
