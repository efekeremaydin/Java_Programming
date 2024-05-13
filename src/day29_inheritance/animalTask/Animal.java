package day29_inheritance.animalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public static boolean isAnimal = true;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +// instead of Animal, you should use these methods to get the class name at the beginning
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                 ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
0. Animal

			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */















