package day27_accessModifiers;

public class CydeoStudent {

    public String name; // these need to be inst as they all need to have separate copies
    public int age;
    public char gender;

    public static String schoolName; // there are multiple steps to go thru to set them so you can't init directly
    // if you only have one var that needs to be set then you can set here, but not all the stat var in future will be easy like this. in the future you will learn some stat var that will need 5-6 steps to set them. you will need the block of code. and for the block we need to use stat block.
    public static String secretCode;


    // in order to set the inst var, we use const:


    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        // schoolName = "CydeoSchool"; // we should not use them here as they will be repeated everytime obj is created. we just need to set them one time.
        // secretCode = "Wooden Spoon";
    }


    static{ // this block will be exec one time only, regardless of how many obj created
        // you can add as many code frag you want
        // all the obj from this class will have one school name, so we only need to init one time
        // static block needs to be exec one time
        // as soon as the class is loaded it's exec, and only runs one time
        // this block can be placed anywhere. before or after the variables
        // but usually first declare the var and then declare the static block to init these stat var
        // anytime you have stat var, if you use stat block, you never go wrong
        schoolName = "Cydeo School";
        secretCode = "Secret Code";
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }






}
