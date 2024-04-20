package day08_ternary_switch;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 100; // first assume that grade is invalid

        String location = "Unknown"; // assume grade is invalid
        int numOfGroups = 0;
        String teacherInCharge = "Unknown";

        if (gradeNumber >= 1 && gradeNumber <= 6) { // this is single if

            if (gradeNumber == 1) { // this is multi branch if
                location = "Apple orchard";
                numOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            } else if (gradeNumber == 2) {
                location = "Zoo";
                numOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            } else if (gradeNumber == 3) {
                location = "Aquarium";
                numOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            } else if (gradeNumber == 4) {
                location = "Movie theater";
                numOfGroups = 2;
                teacherInCharge = "Ms. Lee";
            } else if (gradeNumber == 5) {
                location = "Museum";
                numOfGroups = 5;
                teacherInCharge = "Ms. Lela";
            } else {
                location = "Six Flags";
                numOfGroups = 8;
                teacherInCharge = "Mr. Watt";
            }

        }

        System.out.println("location - " + location);
        System.out.println("number of groups - " + numOfGroups);
        System.out.println("teacher in charge - " + teacherInCharge);
    }
}

/*
2. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown

 */
