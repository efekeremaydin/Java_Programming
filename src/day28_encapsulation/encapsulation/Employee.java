package day28_encapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;

    private String jobTitle;

    private double salary;
    // adv of public: always accessible
    // disadv.: can't control

    // when you create inst var you create as priv. so it has restriction
    // disadv> other classes can't access
    // we have getter setter for this


    public Employee(String name, int age, String jobTitle, double salary) {
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age); // cond will be checked first. if it's invalid it wont set.
        //this.jobTitle = jobTitle;
        setJobTitle(jobTitle);
        //this.salary = salary;
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isBlank() || jobTitle.isEmpty()){
            System.err.println("Job title of the employee cannot be blank: " + jobTitle);
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public String getName() {

        if (name == null){ // if name is not set
            //name = "Unknown";
            return "Unknown"; // this is better than getting null. as if you try to call a method from null keyword it will give you null pointer exception
        }

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can't be empty or blank");
            System.exit(1); // exit program with some issue
        }
        this.name = name;
    }

    public double getSalary() { // no param
        //READ
        return salary;
    }

    public void setSalary(double salary) { // pass arg to update the var
        // WRITE
        // if the inst was public i wouldn't be able to add this cond
        // EVEN IF THERE IS NO COND, DEVS STILL CREATE INST VAR AS PRIVATE JUST IN CASE IF THEY NEED TO ADD COND IN THE FUTURE
        //there is no point making getter and setter private as they are meant to be used outside of the class
        if (salary < 0){
            System.err.println("Salary can't be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}














