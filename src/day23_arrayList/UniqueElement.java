package day23_arrayList;

import day04_concatenation.Concatenation_vs_Addition;

import java.util.ArrayList;

public class UniqueElement {

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

        Integer result = 0;

        for (int i = 0; i < list.size(); i++) {

            int count = 0;
            Integer a = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == a){
                    count++;
                }

            }
            if (count < 2 && !(result.equals(a))){
                result +=a;
            }
        }
        System.out.println(result);






    }
}


/*
3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */