package day31_inheritance.vehicleTask;

public class Airplane extends Vehicle {
    public Airplane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly() {}
}
