package day33_abstraction.employeeTask;

public class Teacher extends Employee{ // this would give compiler error if it doesn't include the impl of abs methods of the parent Employee

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    // if child class is non-abs it must overr the abs meth in the parent
    @Override
    public void work(){
        System.out.println(getName() + " is teaching.");

    }


















}
