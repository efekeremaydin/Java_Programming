package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Audi is running");
    }

    public void autoPark(){
        System.out.println("Audi is parking");
    }
}
