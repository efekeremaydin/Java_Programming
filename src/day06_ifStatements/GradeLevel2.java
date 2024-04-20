package day06_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel = 18;

        String result = ""; // temp value
        System.out.println(result + "this is the initial result");

        if(gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elementary";
        }
        if(gradeLevel >= 6 && gradeLevel <= 8){
            result = "Middle";
        }
        if(gradeLevel >= 9 && gradeLevel <= 12){
            result = "High";
        }
        if(gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }
        if(gradeLevel >= 17 && gradeLevel <= 18){
            result = "Grad";
        }

        System.out.println("this is the final result: " + result);






    }
}
