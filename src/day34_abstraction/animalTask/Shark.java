package day34_abstraction.animalTask;

public class Shark extends Animal implements WildAnimal, Swimmable {
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {

    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " is eating fish");

    }

    @Override
    public void sleep() {

    }


    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }
}
