package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation{ // inheriting abs methods are optional

    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

   /* @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }*/

    public void drive(){
        System.out.println("Driving" + getMake() + " " + getModel());
    }


















}
