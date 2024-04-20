package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Efe", "Kerem"}; // 4 names
        String[] group2 = {"Aydin", "Feyyaz", "Okan", "Anil"}; // 3 names
        String[] group3 = {"Muzaffer", "Kerem", "Canan", "Yazici", "Aydin"}; // 5 names
        String[] group4 = {"Efe", "Canan"}; // 2 names

        //2D String array to add all of above
        String[][] groups = {group1, group2, group3, group4};
        //                     0        1       2       3


        for (String[] eachGroup : groups) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }
        }

        System.out.println("---");

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0;  j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("---");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("---");

        // groups in reverse order
        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            //System.out.println(Arrays.toString(groups[i]));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
//            for (int j = 0; j < eachGroup.length; j++) {
//                String eachStudent = eachGroup[j];
//                System.out.println(eachStudent);
//            }
        }

        System.out.println("---");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups)); // toString() is for 1D arrays only

        System.out.println(Arrays.deepToString(groups)); // deepToString() is for MD arrays only





    }
}
