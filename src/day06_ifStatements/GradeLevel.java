package day06_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 18;

        if(gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("Elementary");
        }
        if(gradeLevel >= 6 && gradeLevel <= 8){
            System.out.println("Middle");
        }
        if(gradeLevel >= 9 && gradeLevel <= 12){
            System.out.println("High");
        }
        if(gradeLevel >= 13 && gradeLevel <= 16){
            System.out.println("College");
        }
        if(gradeLevel >= 17 && gradeLevel <= 18){
            System.out.println("Grad");
        }






    }

}
