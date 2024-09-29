package day34_abstraction.animalTask;

public abstract class Animal {

    private String name, breed;
    private final char gender;
    private int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        this.gender = gender;
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }
    
    // you can't have the setter if you set the var to final
    /*public void setGender(char gender) {
        this.gender = gender;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void drink();
    //System.out.println(name + " is drinking water");


    public abstract void eat();
    //System.out.println(name + " is eating");


    public abstract void sleep();
    //System.out.println(name+ " sleeps 8 hours");

    // if you put this play method in the animal class then all animals need to inherit
    //public abstract void play();


    public String toString() {
        return  getClass().getSimpleName() + "{"+
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }






















}
