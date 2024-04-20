package day19_array;

public class MaxNumber2 {

    public static void main(String[] args) {

        int[] number = {100, 20, 500, 40, -10, 30};

        int max = number[0]; // assume that first element is the max number

        for (int i = 1; i < number.length; i++) { // i: 1, 2, 3, 4, 5 (excluding ind 0 as we assume that's the max numbr  )
            if (number[i] > max){  // compares the el of array with the current max number
                // each eleemnt compare with currrent max number. if greater then:
                // 20 > 100 false. loop continues. 500>100 true. 500 will be assigned to max.
                max = number[i]; // replace the current max with that number
            }
        }
        System.out.println(max);
    }
}
