package day34_abstraction.animalTask;

public class Dog extends Animal implements Playable, Swimmable{
    // when first implementing Playable it will give ce cuz non-abs class can't have abs m as is
    // every m here should have a body


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {

    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");

    }

    @Override
    public void sleep() {

    }

    // no need to create the play method one by one, instead inherit from the interface
    //public void play() {}

    @Override
    public void play() {
        System.out.printf("Dog " + getName() + " is playing with its owner");

    }

    @Override
    public void swim() {

    }
}
