package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange"); // no pm

        // no pm and we can call any m
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();

        Animal tiger1 = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger1.eat(); // if eat m is overr in tiger class then that m will be exec
        tiger1.drink();
        tiger1.sleep();
        // tiger1.hunt(); // this doesnt exist in the animal class so you can't call it. only the vars and m in ref type can be called
        // not every animal has hunt method. that's why even though it's a tiger obj we can't call from this ref type.

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Blue");

        animal.eat(); // these m are inherited from parent class Animal
        animal.drink();
        animal.sleep();
//        animal.fly(); Animal class doesn't have the fly m. Ref type decides whether we can access to the m or not.
        Flyable animal2 = new Eagle("John1", "American Eagle", 'M', 3, "Small", "Blue"); // we can use Flyable as interface since there's IS-A relationship

        animal2.fly();

        // animal2.eat(); can't call these below as it's not in Flyable interface
        //animal2.drink();
        //animal2.sleep();

        System.out.println(animal2.canFly);

        System.out.println("---");

        Eagle an1 = new Eagle("John2", "American Eagle", 'M', 3, "Small", "Blue");
        Parrot an2 = new Parrot("John3", "Parrot", 'M', 3, "Small", "Blue");
        Duck an3 = new Duck("John4", "Duck", 'M', 3, "Small", "Blue");

        Flyable[] flyables = {an1, an2, an3};

        System.out.println("---");

        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = new Dog("John5", "Duck", 'M', 3, "Small", "Blue");
        Cat cat = null;
        CydeoCar cydeoCar = null; // we can still add them to the swimmable array below as it has IS-A relationship.

        Flyable[] birds = {parrot, eagle, duck}; // you can add the objs that has IS-A rel. with Flyable interface.

        Swimmable[] swimmable = {shark, dolphin, duck, cydeoCar};

        Playable[] playables = {dog, cat, parrot, dolphin, duck}; // pm means ref type coming from either Parent Class or Interface, obj created from the child class

        System.out.println("---");

        // instanceof

        //boolean isAnimal = cydeoCar instanceof Animal; // this shows that cydeoCar doesnt have IS-A rel. with Animal.

        boolean isAnimal = dog instanceof Animal; // this shows that dog as IS-A rel. with Animal

        System.out.println("isAnimal = " + isAnimal);

        System.out.println("---");

        Car car = new Tesla("Tesla", "Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla; // car obj has IS-A rel. with Tesla
        boolean isAudi = car instanceof Audi; // car obj doesnt have IS-A rel with Audi
        boolean isElectricCar = car instanceof Electric; // Tesla has IS-A rel with Electric Interface
        boolean isTesla2 = car instanceof Car;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot; // as long as there is IS-A rel with the obj and type you specify after "instanceof" this will give you true

        System.out.println("isTesla2 = " + isTesla2);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("isTesla2 = " + isTesla2);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);

        // this is imp as once you make the parent type as ref type there will be so many objs, obj type can be any one of those child class objs

        // if the obj type is unknown, you can use the "instanceof" keyword

        Animal animal3 = new Dog("John5", "Duck", 'M', 3, "Small", "Blue");

        // determine below if above animal3 object is a Dog or Cat object
        if (animal3 instanceof Cat) {
            System.out.println("It is a cat");
        }else{
            System.out.println("It is not a cat");
        }



        













    }
}
