package day31_inheritance.vehicleTask;

public class Yacht extends Boat
{ // this is multi-level inheritance
    public Yacht(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
}
