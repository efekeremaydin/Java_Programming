package day23_arrayList;

import java.util.ArrayList;

public class AvrNumber {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        int sum = 0;

        nums.add(100);
        nums.add(200);

        for (Integer each : nums) {
            sum+=each;
        }

        int avr = sum/(nums.size());
        System.out.println(avr);
    }
}

/*
2. Write a program that can find the average number from an arrayList of integers
 */