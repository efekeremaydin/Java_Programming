package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Driver;
import day33_abstraction.employeeTask.Employee;
import day33_abstraction.employeeTask.Tester;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        //Cat cat = new Dog(); can't be done as ref type is different (Dog default ref type is Dog) and there's no IS A rel

        Animal animal = (Animal) new Dog(); // can be done with pm, this is possible due to UPCASTING (IMPLICIT)
        // if the new Dog obj hadn't been upcasted then it wouldn't have been possible to assign to Animal


        System.out.println("---");

        Animal animal1 = new Dog(); // upcasting ==> pm
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //animal1.bark(); // not possible as in pm ref type decides what's accessible.
        // you can only access via downcasting animal1

        ( (Dog)animal1 ).bark(); // downcasting

        // or if you need to use this m more than once use below:

        //Dog dog1 = (Dog)animal1; // downcasting

        //dog1.bark(); // this is still referring to the same obj => animal1.
        // if there was no IS A rel then you would get ClassCastException

        System.out.println("---");

        // ((Cat)animal1).scratch(); // ClassCastException as Dog doesnt have IS A rel with Cat so it can't be downcasted to Cat

        System.out.println("---");

        Phone phone = new Nokia("XR20", "Small", 350, "Black"); // upcasting => pm. UPCASTING is why you have pm in the first place.

        phone.call(123);
        phone.text(12);

        //phone.selfDefense(); // can't be called as this is unique to Nokia class

        ((Nokia)phone).selfDefense(); // can be called now after downcasting

        //((Nokia) phone).selfDefense();

      // ( (IPhone) phone ).faceTime(1232); // Nokia can't be converted to IPhone as there is no IS-A rel. btw Nokia and IPhone

        System.out.println("---");

        Employee employee = new Developer("Lucy", 38, 'F', "AB", "Java Dev", 95000, "Java");

        employee.work();


        System.out.println(((Developer)employee).getProgrammingLanguage()); // downcasting is a must here

        //Tester tester = (Tester) employee; // ClassCastException. can't be done as Developer and Tester don't have IS A rel. employee is a Developer obj.

        Driver driver = (Driver) employee; // same as above

        System.out.println("---");

        Electric electric = new Tesla("Tesla", "Model S", "White", 2023, 213213); // there's impl casting here

        electric.charge();
        ((Tesla)electric).selfDrive();
        ((Tesla)electric).autoPark();
        ((AutoPilot)electric).selfDrive();




    }























}
