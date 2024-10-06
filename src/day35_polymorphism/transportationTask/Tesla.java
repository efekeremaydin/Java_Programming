package day35_polymorphism.transportationTask;

public class Tesla extends Car implements AutoPilot, Electric{ // no need to implement both AutoPark and AutoPilot as AutoPilot includes all interfaces that AutoPark has (since it extends to AutoPark already)
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

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
}
