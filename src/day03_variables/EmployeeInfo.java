package day03_variables;

public class EmployeeInfo {

    public static void main(String[] args) {

//        If you don't have variable you have to write the name all the time
//        System.out.println("Aaron");
//        System.out.println("Aaron");
//        System.out.println("Aaron");
//
//        String name = "Aaron";
//        System.out.println(name);
//        System.out.println(name);
//        System.out.println(name);

        String employeeName = "Efe";
        int age = 33;
        char gender = 'M';
        String companyName = "Apple",
                jobTitle = "Java Developer";
        int employeeId = 123123,
                salary = 750000;
        boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("--------------");

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("companyName = " + companyName);
        System.out.println("salary = " + salary);
        System.out.println("employeeId = " + employeeId);
        System.out.println("isFullTime = " + isFullTime);



    }
}


/*
1. CreateaclassnamedEmployeeInfo.java
2. Declarethefollowingvariableswithappropriatedatatypes:
1. name
2. age
3. gender
4. companyName 5. employeeId
6. jobTitle
7. salary
8. isFullTime
 */