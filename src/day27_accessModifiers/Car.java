package day27_accessModifiers;

public class Car { // outer class

    // if another custom obj belongs to the Car then you can create it within the car

    public String make, model, colour;
    public int year;
    public int price;

    public static int wheels = 4;

    public class CarEngine{ // inner
        // inner class can access members of outer class
        // in order to use this class you have to first use the Car class

        // if this class is not static you can only declare non-stat members
        // this class belong to outer class' obj

        //public static int a; // this can't be done

        // inner class can use all outer class members
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

        // ***in order to create inner class obj you have to create outer class obj first
        // inner class is also an instance of the outer class
        // *** wjthout the car obj there's no car engine obj

    }

    public static class StaticInnerClass{ // static only accepts static
        // this is a class member so no obj need to call. it can be call through the outer class name Car

        // only accepts the static members of outer class

        public void method(){
            // System.out.println(make); gives error cuz this method only accepts static members of the other class:
            System.out.println(wheels);
        }
    }

    // CLASSES CAN BE STATIC BUT ONLY IF IT'S THE INNER CLASS. AND FOR THE INNER CLASS THERE HAS TO BE AN INNER CLASS



















}
