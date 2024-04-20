package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5]; // {0,0,0,0,0}

        array[0] = 10; //{10,0,0,0,0}
        array[1] = 20; //{10,20,0,0,0}
        array[3] = 30;
        array[4] = 40;
        // array[5] = 50; you can't add this

        System.out.println(Arrays.toString(array));

        //disadv = need to know the size in advance
        //Coll dynamic, not static. size changeable.
        //ArrayList has add remove element methods
        // Array supports prim/non prim that's the adv
        // Perf. Array is fastest
        // in order to use ArrayList you have to create obj and add remove
        // we don't need to know the total number of elements for ArrayList


        System.out.println("---");

        ArrayList<Integer> list = new ArrayList<>(); // best thing is not to set anything on the second part

        System.out.println(list);
        System.out.println(list.size());// collection standard ds



















    }
}
