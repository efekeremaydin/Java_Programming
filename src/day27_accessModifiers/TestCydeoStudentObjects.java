package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName); // the moment i call the stat var thru the class name the static block gets exec.
        // once stat block is exec Cydeo School is set the schoolName
        // if inst, depends on obj
        // if not inst, does not depend on obj

        // const set all the inst
        CydeoStudent student1 = new CydeoStudent("Ekaterina", 29, 'F');
        CydeoStudent student2 = new CydeoStudent("Alena", 28, 'F');

        // when you create the obj class is already loaded
        // then static block gets exec which means those var are set
        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName); // obj shares whatever the class has, but this is not a legal way to call stat var
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);



    }



}
