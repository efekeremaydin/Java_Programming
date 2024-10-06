package day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPark{ // as Audi is a Car and Car is extending Transportation and Audi is non-abs class it needs to override the abs methods of Transportation
// Car class can't provide everything that Audi needs so it needs the AutoPark interface

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }
}
