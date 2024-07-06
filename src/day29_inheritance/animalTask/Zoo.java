package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        Cat cat = new Cat();
        cat.setInfo("Felicia", "stray", 'F', 3, "Medium", "Black and White");
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("---");

        dog.eat(); // called from Dog class
        dog.sleep();
        dog.drink();

        cat.eat();// called from Cat class, inh from Animal class
        cat.drink();
        cat.sleep();

        tiger.eat(); // Tiger class, inh from Animal class
        tiger.drink();
        tiger.sleep();





        System.out.println("---");

        dog.bark();
//         cat.bark();
//        tiger.bark();

        cat.meow();
//        dog.meow();
//        tiger.meow();

        tiger.hunt();
//        dog.hunt();
//        cat.hunt();



        // OBJECT CLASS IS THE PARENT OF ALL CLASSES.
        // THE MOMENT YOU CREATE A CLASS ALL THE METHODS OF THE OBJECT CLASS IS IMPLICITLY INHERITED.
        // FOR EXAMPLE: toString Method


        System.out.println("---");

        // if the access mod is public you can change these directly from any other class.
        /*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = -100;
        */

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);






































    }
}