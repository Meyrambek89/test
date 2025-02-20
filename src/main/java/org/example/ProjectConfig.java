package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    @Primary
    public Car car() {
        Car car = new Car();
        car.setName("Lexus");
        car.setYear(2023);
        return car;
    }

    @Bean
    public Car car2() {
        Car car = new Car();
        car.setName("Mercedes");
        car.setYear(2019);
        return car;
    }

    @Bean
    public Car car3() {
        Car car = new Car();
        car.setName("Toyota");
        car.setYear(2017);
        return car;
    }

    @Bean
    public MyCars myCars(Car car) {
        MyCars myCars = new MyCars(car);
        myCars.setName("Es250");
        myCars.setColor("White");
        return myCars;
    }

}
