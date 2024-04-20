package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudentsObjects {

    public static void main(String[] args) {
        Student s1 = new Student("Efe", "A01", 33, 'M');

        System.out.println(s1);

        StudentsGroup g1 = new StudentsGroup("G1", "G01", new  ArrayList<>(Arrays.asList("Efe", "Canan", "Muzaffer")));

        System.out.println(g1);

        g1.addStudent("E");

        System.out.println(g1);

        StudentsGroup g2 = new StudentsGroup("G2", "G02", new  ArrayList<>(Arrays.asList("A", "B", "C")));


        g2.removeStudent("A");

        System.out.println(g2);

        StudentsGroup2 g3 = new StudentsGroup2("G3", "G03");

        StudentsGroup3 g4 = new StudentsGroup3("G4", 4);

        g4.addStudent(s1);



    }


}
