package day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {

        Honda honda = new Honda("123", "grey", 2033, 123123);


        Audi audi = new Audi("Q6", "Silver", 2020, 36000);
        //Car car3 = new Car("X6", "Red", 2233, 24244); // this would give comp error as the class is abstract and obj can't be inst. from abs class
        // goal of abs class is to create var and m that child classes will need for inheritance purposes only not to inst. objects

        Tesla tesla = new Tesla("123", "grey", 2033, 123123);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("---");
        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("---");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("---");

        audi.autoPark();
        tesla.autoPilot();

    }
}
