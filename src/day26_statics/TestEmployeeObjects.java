package day26_statics;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("A");
        Employee e2 = new Employee("A", 'M');
        Employee e3 = new Employee("A", 'F', "ABC");
        Employee e4 = new Employee("A", 'M', "ADSd", 123123);
        Employee e5 = new Employee("B", "ADSAD");
        Employee e6 = new Employee("A", "adssa", 231214);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);



    }
}
