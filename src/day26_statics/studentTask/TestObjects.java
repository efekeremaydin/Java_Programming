package day26_statics.studentTask;

import java.util.Arrays;

public class TestObjects {

    public static void main(String[] args) {

        Student s1 = new Student("A", "A01", 24, 'M');

        Student s2 = new Student("B", "B01", 22, 'F');
        Student s3 = new Student("V", "C01", 21, 'F');
        Student s4 = new Student("D", "D01", 24, 'M');
        Student s5 = new Student("Q", "E01", 25, 'M');

        Student[] students = {s2, s3, s4, s5}; // CAN WE ALSO ADD THIS STEP TO THE METHOD?

        StudentsGroup3 sg1 = new StudentsGroup3("G1", 3);

        System.out.println(sg1);

        sg1.addStudent(s1);
//        sg1.addStudent(s2);
//        sg1.addStudent(s3);
//        sg1.addStudent(s4);
//        sg1.addStudent(s5);
        sg1.addStudent(students);
        System.out.println(sg1);
        sg1.addStudent("Khashayar", "F35", 34, 'M');

        System.out.println(sg1);
        System.out.println(s1);

        sg1.removeStudent("D01");
        System.out.println(sg1);
        sg1.removeStudent("B01");
        System.out.println(sg1);

        for (Student each : sg1.students) {
            System.out.println(each);
        }

        for (Student each : sg1.students) {
            System.out.println(each.name + " : " + each.id);
        }

        System.out.println("---");


        StudentsGroup3 sg2 = new StudentsGroup3("G2", 2);

        StudentsGroup3 sg3 = new StudentsGroup3("G3", 3);

        StudentsGroup3 sg4 = new StudentsGroup3("G4", 4);

        StudentsGroup3[] groups = {sg1, sg2, sg3, sg4};

        System.out.println(Arrays.toString(groups));


        sg2.addStudent("A", "A22", 33, 'M');

        for (StudentsGroup3 each : groups) {
            System.out.println(each);
        }

        for (Student each : sg2.students) {
            System.out.println(each.name);
        }
        for (Student each : sg3.students) {
            System.out.println(each.name);
        }
        for (Student each : sg4.students) {
            System.out.println(each.name);
        }















    }



}

/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */
