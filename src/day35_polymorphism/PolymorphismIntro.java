package day35_polymorphism;

import day31_inheritance.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");
        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;


        // Dog[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck}; // this only accepts dog object as Dog class has no relationship with these other classes. So Dog class can't take those objects. Dog class can't ref to those animals.

        // in order to use that animal var with these objs we need to provide a data type (class) that has relationship with all these objs (that can be referenced)

        // all those obj -> IS-A rel with Animal class

        Animal[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck}; // all of them are child class of Animal class
        // PM -> if you have multiple dif obj from diff subclasses you can just use one ref type to ref all of these objs
        // whatever is in the Animal class you can call fom this ref type

        Animal animal = dog; // if i make Animal class as ref, then i can use animal variable to reference dog obj above
        // this is a pm, parent being ref to the child (parent ref type being ref to the child objs)
        //

        // Animal animal2 = new Tesla("123", "grey", 2033, 123123); // this can't be done as Animal and Tesla has no relationship

        animal.eat(); // this will implement the dog's version if it's overridden
        // in PM -> ref type decides what you can and can't call. and object type decides which impl of that m will be implemented
        animal.drink();
        animal.sleep();
        //animal.play(); // since ref type is Animal, you can't call dog specific ms
        // so Animal can be a ref to any child class objs but if the ref type doesn't include that m then you can't call them
        //animal.bark();



       // PM allows us to use parent class as ref type and obj type is created from the child class
       // only parent can be ref to the child objs. child class can't be ref to parent objs
            // child can never be ref to the parent

        System.out.println("---");

        String str = "Java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("123", "grey", 2033, 123123);
        Audi audi = new Audi("Q6", "Silver", 2020, 36000);
        Tesla tesla = new Tesla("123", "grey", 2033, 123123);

        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Maths Teacher", 75000);


        Developer developer = new Developer("E", 25,'M', "AB", "Java Dev",123123,"Java");

        Developer developer1 = new Developer("Lucy", 38, 'F', "AB", "Java Dev", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, developer1, driver, tester}; // you can store any objects in this array as it has IS-A relationship with any object you create

        System.out.println(Arrays.toString(objects)); // in this array i can store any obj that i want

        Object[] employees = {developer1, developer, driver, tester, teacher}; // if you know the category it's better to use that as a ref type
        // benefit of using this way: 1. it's more specified 2. m depends on ref type

        //employees.work();// compiler error
        developer1.work();

        Employee obj = new Developer("E", 25,'M', "AB", "Java Dev",123123,"Java");

        obj.work(); // here the work method will be used from Developer class because work m is abstract in Employee class and it's overridden in Developer class.
        // in PM which impl of m get executed always depends on the obj you create

        Object obj1 = new Developer("E", 25,'M', "AB", "Java Dev",123123,"Java");

        // obj.work(); // this wont work here as Obj class doesnt have work m.

        Employee obj3 = new Teacher("James", 45, 'M', "B1", "Maths Teacher", 75000);

        obj3.work(); // child class' work m get executed as it's overr in teacher

        Employee obj4 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        obj4.work(); // obj type will decide which impl method will be executed. This obj is driver. Ref type decide whether you can or can't call this m

        System.out.println("---");

        Car car1 = new Tesla("Model Y", "White", 2020, 55000); // this is not pm. ref and obj type is Tesla

        // car1.start(); compiler error due to start m being protected
        // car1.autoPilot(); // you can't call because Car ref type doesnt have this m

        System.out.println("---");
























    }
}
