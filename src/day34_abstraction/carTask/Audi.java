package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start: " + getMake() + " " + getModel());
    }

    public void autoPark(){ // this can't be private as then we can't use outside the class
        System.out.println(getMake() + " " + getModel() + "" + "has auto park feature");
    }
}
