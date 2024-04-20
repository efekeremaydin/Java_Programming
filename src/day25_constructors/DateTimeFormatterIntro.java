package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        //DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMM/d");
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yy, EEEE");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");
        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022, 7,1);

        System.out.println(date1.format(df)); // July-01-22, Fri

        //DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm"); // standard
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17,5);

        System.out.println(time1.format(tf)); // 07:05

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));

        System.out.println("---");

        //Pratice

        //1. use the LocalDateTime get the date and time in the following format:
        //Tuesday, 1:00 pm, Nov/24/2020

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println(time2.format(dtf2));
        LocalDateTime time3 = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(time3.format(dtf2));


        //Tuesday, 1:00 pm, Nov/24/2020


    }
}
