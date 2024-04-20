package day19_array;

public class MaxMin2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,8,9,11,4,5};

        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = i;
            }
        }
        System.out.println(arr[max]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min =i;
            }
        }
        System.out.println(min);

    }
}
