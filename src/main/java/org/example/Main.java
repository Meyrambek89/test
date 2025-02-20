package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        MyCars myCars =context.getBean(MyCars.class);
        Car car=context.getBean(Car.class);
        System.out.println(car.getName());

        }
    }
