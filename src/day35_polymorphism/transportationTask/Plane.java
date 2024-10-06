package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() { // if there's one impl. for all sub classes of Plane then the fly method needs to be overr. here
        System.out.println(getMake() + " " + getModel() + " is flying");

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    public void land(){
        System.out.println("Plane " + getMake() + getModel() + " is landing");
    }




















}
