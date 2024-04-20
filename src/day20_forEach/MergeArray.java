package day20_forEach;

public class MergeArray {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = new int[6];

        for (int i = 0; i < 4; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 4; i < 6; i++) {
            arr3[i] = arr2[i];
        }
    }
}
