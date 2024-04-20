package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); //2024-01-27

        System.out.println(today);


        LocalDate birthDay = LocalDate.of(1987, 9, 5); // immutable
        System.out.println(birthDay);

        System.out.println("---");

        System.out.println(today.getYear()); // 2024

        System.out.println(today.getMonth()); // Jan

        System.out.println(today.getDayOfMonth()); // 27

        System.out.println(today.getMonthValue()); // 1

        System.out.println(today.getDayOfWeek()); // Sat

        System.out.println(birthDay.getDayOfWeek()); // Sat

        System.out.println(today.getDayOfMonth()); // 27

        System.out.println(today.getDayOfYear()); // 27

        System.out.println("---");

        today = today.plusYears(1);
        System.out.println(today);

        System.out.println("-----");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        graduationDate = graduationDate.plusYears(2); // 2027-6-4

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);

        System.out.println("---");


        LocalDate yourBirthday = LocalDate.of(2005, 4,1);
        LocalDate olderBroBD = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(olderBroBD);

        System.out.println("---");

        LocalDate birthday1 = LocalDate.of(1994, 7,7);
        LocalDate birthday2 = LocalDate.of(1994, 7,7);

        boolean r1 = birthday1.isEqual(birthday2); // checks if it's same date
        System.out.println(r1);

        System.out.println("---");

        LocalDate grad_date = LocalDate.of(2023, 1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022, 12,31))); // false

        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12,31))); // true

        System.out.println("---");

        System.out.println(LocalDate.of(2022, 6,16).isLeapYear());















    }
}
