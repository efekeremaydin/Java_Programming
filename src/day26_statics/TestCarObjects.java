package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {

        Car c1 = new Car("Mercedes");

        Car c2 = new Car("Mercedes", "S600");

        Car c3 = new Car("Toyota", "Camry", 2010);

        Car c4 = new Car("Honda", "Accord",2020, 30000);

        Car c5 = new Car("Lexus", "RX350", 2019, 40000, "Black");


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);











    }
}
