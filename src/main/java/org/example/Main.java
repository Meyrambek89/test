package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car car = context.getBean(Car.class);
        System.out.println("My car is : " + car.getName() + " (" + car.getYear() + ")");
        MyCars myCars = context.getBean(MyCars.class);
        System.out.println("MyCar Name: " + myCars.getName());
        System.out.println("MyCar Color: " + myCars.getColor());
        System.out.println("In my garage I have a " + car.getName() + " " + myCars.getName() +" " +  car.getYear() + " in " + myCars.getColor() + " color ");

    }
}

