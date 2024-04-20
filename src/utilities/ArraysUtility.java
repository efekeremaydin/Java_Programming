package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // this is to iterate the ind number for arr3 for the second loop

        for (int i = 0; i < arr1.length; i++, k++) { // i  : for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's ind numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // this is to iterate the ind number for arr3 for the second loop

        for (int i = 0; i < arr1.length; i++, k++) { // i  : for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's ind numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // this is to iterate the ind number for arr3 for the second loop

        for (int i = 0; i < arr1.length; i++, k++) { // i  : for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's ind numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // this is to iterate the ind number for arr3 for the second loop

        for (int i = 0; i < arr1.length; i++, k++) { // i  : for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's ind numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static int[] reverse(int[] array) {

        int[] reversed = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static double[] reverse(double[] array) {

        double[] reversed = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static String[] reverse(String[] array) {

        String[] reversed = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static char[] reverse(char[] array) {

        char[] reversed = new char[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    public static int[] addElement (int[] array, int element){
        int[] new_array = Arrays.copyOf(array, array.length+1); // copy all of first array and then paste into the array with 1 more length
        new_array[new_array.length-1] = element;
        return new_array;
    }

    public static double[] addElement (double[] array, double element){
        double[] new_array = Arrays.copyOf(array, array.length+1); // copy all of first array and then paste into the array with 1 more length
        new_array[new_array.length-1] = element;
        return new_array;
    }
    
    public static char[] addElement (char[] array, char element){
        char[] new_array = Arrays.copyOf(array, array.length+1); // copy all of first array and then paste into the array with 1 more length
        new_array[new_array.length-1] = element;
        return new_array;
    }

    public static String[] addElement (String[] array, String element){
        String[] new_array = Arrays.copyOf(array, array.length+1); // copy all of first array and then paste into the array with 1 more length
        new_array[new_array.length-1] = element;
        return new_array;
    }

    public static boolean contains (int[] array, int element){
        for (int each : array) {
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains (double[] array, double element){
        for (double each : array) {
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains (char[] array, char element){
        for (char each : array) {
            if (each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains (String[] array, String element){
        for (String each : array) {
            if (each.contains(element)){
                return true;
            }
        }
        return false;
    }

    // array = {10,20,30,40} , 2 ===> {10,20,40}
    public static int[] remove(int[] array, int index){

        int[] newArray = new int[array.length-1];

        //int newIndex = 0;

        for (int i = 0, j = 0; i < array.length; i++) {
            if(  i == index ){
                continue; // skip and go back up to the next iteration
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }
    public static double[] remove(double[] array, int index){

        double[] newArray = new double[array.length-1];

        //double newIndex = 0;

        for (int i = 0, j = 0; i < array.length; i++) {
            if(  i == index ){
                continue; // skip and go back up to the next iteration
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static char[] remove(char[] array, int index){

        char[] newArray = new char[array.length-1];

        //char newIndex = 0;

        for (int i = 0, j = 0; i < array.length; i++) {
            if(  i == index ){
                continue; // skip and go back up to the next iteration
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }

    public static String[] remove(String[] array, int index){

        String[] newArray = new String[array.length-1];

        //String newIndex = 0;

        for (int i = 0, j = 0; i < array.length; i++) {
            if(  i == index ){
                continue; // skip and go back up to the next iteration
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }
    

    // int[] arr = {10, 10, 20};
    // contains metodu kullan
    public static int[] removeDup(int[] array){

        int[] newArray = new int[0];

        for (int i = 0; i < array.length; i++) {
            if (!(ArraysUtility.contains(newArray, array[i]))){
                newArray = ArraysUtility.addElement(newArray, array[i]);
            }
        }
        return newArray;

    }

    public static double[] removeDup(double[] array){

        double[] newArray = new double[0];

        for (int i = 0; i < array.length; i++) {
            if (!(ArraysUtility.contains(newArray, array[i]))){
                newArray = ArraysUtility.addElement(newArray, array[i]);
            }
        }
        return newArray;

    }

    public static char[] removeDup(char[] array){

        char[] newArray = new char[0];

        for (int i = 0; i < array.length; i++) {
            if (!(ArraysUtility.contains(newArray, array[i]))){
                newArray = ArraysUtility.addElement(newArray, array[i]);
            }
        }
        return newArray;

    }

    public static String[] removeDup(String[] array){

        String[] newArray = new String[0];

        for (int i = 0; i < array.length; i++) {
            if (!(ArraysUtility.contains(newArray, array[i]))){
                newArray = ArraysUtility.addElement(newArray, array[i]);
            }
        }
        return newArray;

    }


    /*public static boolean contains (int[] array, int element){
        boolean b = false;
        for (int each : array) {
            if (each == element) {
                b = true;
                break;
            } else {
                b = false;
            }
        }
        return b;

    }*/
   /* public static boolean contains (char[] array, char element){
        boolean b = false;
        for (char each : array) {
            if (each == element) {
                b = true;
                break;
            } else {
                b = false;
            }
        }
        return b;
    }

    public static boolean contains (String[] array, String element){
        boolean b = false;
        for (String each : array) {
            if (each.equals(element)) {
                b = true;
                break;
            } else {
                b = false;
            }
        }
        return b;
    }*/
    
    
    


}
