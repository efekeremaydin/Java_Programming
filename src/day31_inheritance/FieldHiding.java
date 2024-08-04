package day31_inheritance;

class A{ // if i have a second class in the same file, i can give default access mod to the second class

    public int a = 100;

}


public class FieldHiding extends A {

    public int a = 300;

    public static void main(String[] args) {

        //FieldHiding fieldHiding = new FieldHiding(); // instance m can only be called thru the obj

      //  System.out.println(fieldHiding.a);

        System.out.println( new FieldHiding().a);
    }















}
