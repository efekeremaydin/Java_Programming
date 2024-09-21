package day31_inheritance.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // to check it's an overriden method you can use Override annotation, if it doesnt give compile error then it overrides

   /* @Override
    public void eat() {
        super.eat(); // don't need this as we will have different impl.
    }*/


    @Override // this is optional you can remove if you like
    public void eat() { // return type, parameters and method name must be same to override
        // access mod should be same or more visible

        // if the method is private or final it can't be inherited

        //if you call from cat object it will call this method or else if you call from Animal object it will call that method

        System.out.println("Cat " + getName() + " is eating cat food");

    }

    @Override
    public void sleep() { // we have only one sleep method with diff impl.
        // super.sleep();
        System.out.println("Cat " + getName() + " sleeps 12 hours in a day");
    }

    @Override
    public void drink() {
        System.out.println("Cat " + getName() + " is a drinking milk");
    }

    // @Override can't be overridden as it's unique
    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching");
    }
}






















