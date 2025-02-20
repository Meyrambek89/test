package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Bean
    @Primary
    public Car car() {
        Car car = new Car();
        car.setName("Lexus");
        return car;
    }
    @Bean
    public Car car2() {
        Car car = new Car();
        car.setName("Mercedes");
        return car;
    }
    @Bean
    public Car car3() {
        Car car = new Car();
        car.setName("Toyota");
        return car;
    }
    @Bean
    public MyCars cars(Car car) {
        MyCars myCars = new MyCars(car);
        myCars.ShowCars();
        return myCars;
    }
}
