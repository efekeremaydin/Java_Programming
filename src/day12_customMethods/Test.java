package day12_customMethods;

public class Test {

    public static void main(String[] args) {

        int number = 300;
        CustomMethodWithParameter.oddOrEvenNumber(number); // better to call the method class name as utility

        String firstName = "Efe",
                lastName = "Aydin";
        CustomMethodWithParameter.initial2(firstName, lastName);

        CustomMethodWithParameter.initial2("Efe", "Aydin");
        // adv of static modifier is we can call them from the class name right away


    }
}
