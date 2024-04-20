package day24_dateAndTime;

import day23_arrayList.ArrayArrayListConversion;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Efe", 'M', LocalDate.of(1988, 10, 18));
        people[2].setInfo("Canan", 'F', LocalDate.of(1987, 9, 5));
        people[3].setInfo("Muzaffer", 'M', LocalDate.of(2023, 1, 3));
        people[4].setInfo("Sam", 'M', LocalDate.of(1960, 2, 25));

        ArrayList<Person> studentsList = new ArrayList<>();

        studentsList.addAll(Arrays.asList(people)); // you need to convert it to Collections to add to the ArrayList

        System.out.println(Arrays.toString(people));
        System.out.println(studentsList);

        // print name and date of birth of each person obj

        for (Person each : studentsList) {
            System.out.println(each.name + " : " + each.dateOfBirth );
        }

        // remove older than 55 years old
        studentsList.removeIf(p -> p.age > 55);
        System.out.println(studentsList);


    }
}
