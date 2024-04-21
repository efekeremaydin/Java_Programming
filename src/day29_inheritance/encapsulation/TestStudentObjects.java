package day29_inheritance.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student s1 = new Student("Efe", 33, 'M', 'A', "Cydeo");

        System.out.println(s1);
        s1.setSchoolName("Harvard");
        s1.setGrade('B');
        System.out.println(s1);


        s1.study();




    }
}
