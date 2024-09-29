package day34_abstraction.animalTask;

public class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {

    }

    @Override
    public void eat() {
        System.out.printf("Cat " + getName() + " is eating cat food" );

    }

    @Override
    public void sleep() {

    }


    @Override
    public void play() {
        System.out.println("Cat " + getName() + " is playing with its owner");
    }
}
