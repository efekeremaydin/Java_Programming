package day28_encapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;
    // public String planet;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    /*static {
        boolean isHuman = true;
        boolean hasNose = true;
        int numberOfWings = 0;
        int numberOfHead = 0;

    }*/

    public Person(String name){ // allows us to create a Person obj just by setting the name
        this.name = name;
    }

    public Person(String name, int age){ // allows us to create a Person obj by setting the name and age
        this(name);
        this.age = age;
    }

    public Person(String name, String language){ // allows us to create a Person obj by setting the name and language
        this(name);
        this.language = language;
    }

    public Person(String name, char gender){ // allows us to create a Person obj by setting the name and gender
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender){ // allows us to create a Person obj by setting the name, age and gender
        this(name, age);
        //this(name, gender); one const cannot call more than one const
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language){ // allows us to create a Person obj by setting the name, age, gender and language
        this(name, age, gender);
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;

        // name = "Josh"; inst var can't be set here. static only accepts statics
    }


    public static void printPlanetName(){ // if you keep it as instance you need to create obj every single time, which means memory > resources > cost
        System.out.println("Planet name is " + planet);
    }

    public void eat(String food){ // you will use inst var so this needs to be inst meth
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){ // ask if the method needs to use inst or stat methods and var, to decide whether you use inst or stat method
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        // toString meth gets exec as soon as the obj is printed
        // only includes the inst var
        // you can add static members here
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", isHuman='" + isHuman + '\'' +
                ", hasNose='" + hasNose + '\'' +
                ", numberOfWings='" + numberOfWings + '\'' +
                ", numberOfHeads='" + numberOfHeads + '\'' +
                '}';
    }


    /*    public String toString() { // toString meth gets exec as soon as the obj is printed
        // only includes the inst var
        // you can add static members here
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';


    }*/

}
