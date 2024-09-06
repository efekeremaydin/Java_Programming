package day32_finalKeyword;

import java.time.LocalDate;

class Student{ // immutable (like String class)

    public final void language(){
        System.out.println("Java Programming");
    }
}



public final class FinalKeyword extends Student{ // if you want this class to be parent then never use final keyword, otherwise it's ok

  /*  public void language(){ // final methods can't be overridden
        System.out.println("Python Programming");
    }*/

   /* public final FinalKeyword(){ // const. can't be final

    }*/

    public static void main(String[] args) {


        final char gender = 'M'; // unchangeable
        System.out.println(gender); // M

        //gender = 'F';
        System.out.println(gender); // F

        System.out.println("---");

        final LocalDate dateOfBirth = LocalDate.now(); // unchangeable
        System.out.println(dateOfBirth);

      //  dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        Student cydeoStudent = new Student();
        cydeoStudent.language();
        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.language();

        System.out.println("---");

        final String name = "James"; // final was added to prevent garbage col.
        //name = null; // to make it eligible for garbage col.
        //name = "Daniel"; // to make it eligible for garbage col.

        System.out.println(name);




    }







}
