package day28_encapsulation.encapsulation;

public class Student {

    private String name;
    // public always has disadvantage
    // you can modify anything you want
    // private has some disadvantages as well. you can't directly access. How to fix it? You generate GETTER and SETTER

    // there's a shortcut for generating
    // everytime you have inst var, it's best if you keep PRIVATE
    // DEVS make the mod private in case they need to add conditions


    public String getName() {

        if (name == null){ // checking whether name object exists
            System.err.println("Name has not been set");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                hasDigit = true;
                break;
            }
        }
        if (hasDigit){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int age; // anyone can access
    private int age2; // only internal members can access
    // why keeping private? so that you can add security checks in the getters and setters. you can set some conditions
    // IF THE DATA WAS PUBLIC YOU CAN'T ADD CONDITIONS


    public int getAge2(){ // to read the data - READ ONLY
        if(age2 == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age2; // returns whatever is stored in the var age.
    }

    public void setAge2(int age2){ // WRITE ONLY

        if (age2 < 1 || age2 > 100){ // if the age is invalid
            System.err.println("Invalid age: " + age2);
            //return; // for exiting the method
            System.exit(1); // entire program gets terminated
        }

        this.age2 = age2;
    }














}
