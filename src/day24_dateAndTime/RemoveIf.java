package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveIf {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {
            if (each <= 4 ){
                continue;
            }
            newList.add(each);
        }
        System.out.println(newList);

    }


}

/*

    2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */
