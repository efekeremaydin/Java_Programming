package day17_customClass;

public class TestDogObjects {


    public static void main(String[] args) {

        //String dog1 = new Dog(); // constructor and Dog object
        // for it to be reusable
        // this is a dog object so it can't be from String or int variable/class

        Dog dog1 = new Dog(); // datatyoe has to be Dog
        // how COME data type is DOG? what does that mean? hmm maybe it's like String as String is also a data type.

        //dog1 is ref or objcet name
        // it will ref to the new Dog ();

        // thru . you can access all instances

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.colour = "Gray";

        dog1.eat(); // Max is eating
        dog1.drink(); // Max is drinking
        // def value of String is null

        System.out.println(dog1); // this will create hashcode as there's no toString method in the Dog class

        Dog dog2 = new Dog();
        dog2.name = "Bella";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.colour = "Orange";

        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "black");

        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat(); // only Loki will be eating
        dog2.drink();










    }





}
