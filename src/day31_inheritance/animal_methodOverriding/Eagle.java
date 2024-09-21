package day31_inheritance.animal_methodOverriding;

public class Eagle extends Animal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snake");
    }

    @Override
    public void drink() {
        System.out.println("Eagle " + getName() + " is drinking water");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " "+  getName() + " is sleeping");

    }
}


