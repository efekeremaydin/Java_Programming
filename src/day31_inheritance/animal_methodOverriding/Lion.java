package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }


    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar() {

        System.out.println("Lion " + getName() + " is roaring");
    }

    @Override
    public void drink() {
        System.out.println("Lion "+ getName() + " is drinking milk");
    }

    @Override
    public void sleep() {
        System.out.println("Lion " +getName() + " is sleeping in the cave");
    }

    @Override
    public String toString() {
        return  super.toString().replace("}", "") + // this will exclude the } at the end of the method
                ", African Lion='" + isAfricanLion + '\'' +
                '}';
    }
}
