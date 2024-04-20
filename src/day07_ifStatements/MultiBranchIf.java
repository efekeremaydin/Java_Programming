package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int number = 10;
        String result = "";


        if (number > 0){
            result = "Positive";
        }else if (number <0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);
    }
}
