package day32_finalKeyword.carTask_overriding;

public class Honda extends Car{
    public Honda(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }
}
