package day19_array;

public class MinNumber {

    public static void main(String[] args) {


        int[] number = {100, 20, 500, 40, -10, 30};

        int min = number[0]; // asssume that the first element is the min num
        // even if you use the largest integer approach it's going to be the same thing, largest integer will always be greater than any number in the array and the first condition below will be true automatically and the number in the array will be asssigned to the min variable. This way we will be able to save one loop cycle below (starting from ind 1)

        for (int i = 1; i < number.length; i++) {
            if (number[i] < min){ // compare the element of the array with the current min num
                min = number[i]; // replace the current min number if true
            }
        }
        System.out.println(min);
    }
}
