package day32_finalKeyword.carTask_methodOverriding;

public class Toyota extends Car {


    public Toyota(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }
}
