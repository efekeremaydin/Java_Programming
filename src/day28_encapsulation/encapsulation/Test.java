package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        student.age = -200; // this is invalid. but you can't stop this to be assigned as the data is public.
        // you can gain control over this data if you make it private and access via getter and setter.

        Student student1 = new Student();
        //student1.age2 = -200; // can't be set here as it's private

        // System.out.println(student1.age2); can't be called as age2 is priv

        student1.setAge2(25);
        System.out.println(student1.getAge2());
        System.out.println("TestCydeoDevObject Completed");

        //student1.setName("Aaron123");
        System.out.println(student1.getName());
        System.out.println("TestCydeoDevObject Completed");
        // student1.name = "Aaron";











    }
}
