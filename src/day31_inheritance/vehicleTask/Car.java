package day31_inheritance.vehicleTask;

public class Car extends Vehicle {

    // btw car and vehicle, it's single inheritance
    // one class can only extend one parent class

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive() {
        System.out.println("Driving " + getBrand() + " " + getModel());
    }
}
