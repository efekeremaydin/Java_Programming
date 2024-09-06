package day32_finalKeyword.carTask_methodOverriding;

public class Nio extends Tesla{ // was compiler error as Tesla class was final

    public Nio(String model, String color, int year, int price) {
        super(model, color, year, price);
    }
}
