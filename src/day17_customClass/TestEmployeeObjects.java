package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar", 29, 'M', "Back-end Developer", 98000, "B13");

        // if employee2 age is incorrect
        employee2.age = 39;



        Employee employee3 = new Employee();
        employee3.setInfo("Abidullah", 30, 'M', "Front-end Developer", 99000, "C14");

        // if employee3 name and gender is incorrect
        employee3.name = "Lucy";
        employee3.gender = 'F';

        // these objects are not immutable. there's no final keyword.

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.work();






















    }


}
