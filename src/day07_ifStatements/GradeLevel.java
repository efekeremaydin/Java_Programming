package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 7 ;
        String result = "";

        if (gradeLevel <=5){ // false: gradeLevel >5
            result = "Elementary";
        } else if (gradeLevel <=8) { // false gradeLevel >8
            result = "Middle";
        } else if (gradeLevel <=12) { // false gradeLevel > 12
            result = "High";
        } else if (gradeLevel <= 16) { // false: gradeLevel >16
            result = "College";
        } else{
            result = "Grad";
        }

        System.out.println(result);
    }

}
