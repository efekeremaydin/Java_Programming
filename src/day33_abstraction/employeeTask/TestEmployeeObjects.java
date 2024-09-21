package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //Employee employee = new Employee("D", 54, 'M', "A1", "SDET", 15151);
        // can't create obj from abs class, obj MUST be created from a concrete class (a non-abs class that's extending to the abs class

        // Example of a concrete class obj:
        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Maths Teacher", 75000);


        Developer developer = new Developer("E", 25,'M', "AB", "Java Dev",123123,"Java");

        Developer developer1 = new Developer("Lucy", 38, 'F', "AB", "Java Dev", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(developer1);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("---");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();


    }
}
