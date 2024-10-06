package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;
import day34_abstraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {

    // Multiple Inheritance only achievable via interfaces
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
