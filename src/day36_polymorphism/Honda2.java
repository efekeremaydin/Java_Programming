package day36_polymorphism;

import day34_abstraction.carTask.Car;

public class Honda2 extends Car2 {
    public Honda2(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override // annotation is opt.
    public void start() { // same or more visible access mod
        System.out.println("Twist the key to ignition to start " + getMake() + " " + getModel());
    }
}
