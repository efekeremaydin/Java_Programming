package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevObject {

    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("E", 'M', LocalDate.of(1984, 1,1), 12, "Zero to hero", 1);

        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breathe();






    }
}
