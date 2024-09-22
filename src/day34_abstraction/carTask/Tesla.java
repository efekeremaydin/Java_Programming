package day34_abstraction.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Tesla is running");
    }

    public void autoPilot(){
        System.out.println("Tesla is auto pilot");
    }
}
