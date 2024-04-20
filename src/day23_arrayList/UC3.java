package day23_arrayList;

import java.util.ArrayList;

public class UC3 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);
        Integer unique = 0;

        for (int i = 0; i < list.size(); i++) {
            int freq = 0;
            Integer a = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == a){
                    freq++;
                }
            }
            if (freq == 1){
                unique+=a;
            }
        }
        System.out.println(unique);



    }
}
