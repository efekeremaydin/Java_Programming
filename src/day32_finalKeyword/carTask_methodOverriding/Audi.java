package day32_finalKeyword.carTask_methodOverriding;

public class Audi extends Car{
    public Audi(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button"
        );
    }
}
