package com.automation.test;

public class CarMain {
    public static void main(String args[]){

        Car1 car = new Car1();
//        car.name="BMW";
//        car.hello();
        car.setName("BMW");
        System.out.println(car.getName());
        car.setColor("Red");
        System.out.println(car.getName());


        Car1 car2 = new Car1();
        car2.setName("Maruti");
        System.out.println(car2.getName());
        car2.setColor("Grey");
        System.out.println(car2.getName());
    }
}
