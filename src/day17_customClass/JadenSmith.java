package day17_customClass;

public class JadenSmith {

    public static void main(String[] args) {

        System.out.println(jadenCase("hello cydeo"));

    }

    public static String jadenCase(String str) {

        //edge case
        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] phrase = str.split(" ");

        String result = "";

        for (String each : phrase) {
            result += (each.charAt(0) + "").toUpperCase() + each.substring(1) + " ";
        }

        return result.trim();

    }
}
