package day34_abstraction.animalTask;

public class Duck extends Animal implements Playable, Flyable{ // so these classes they can't inherit from another class but they can inherit from interfaces
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {

    }

    @Override
    public void eat() {
        System.out.println("Duck " + getName() + " is eating worm");

    }

    @Override
    public void sleep() {

    }


    @Override
    public void play() {
        System.out.println("Duck " + getName() + " is playing");
    }

    @Override
    public void fly() {
        System.out.println("Duck " + getName() + " is flying");
    }
}
