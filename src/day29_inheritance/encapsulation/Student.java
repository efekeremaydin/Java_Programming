package day29_inheritance.encapsulation;

public class Student {

    private String name; // BEST PRACTICE IS TO MAKE INST VAR PRIVATE AT ALL TIMES TO ABLE TO ADD COND LATER IF REQUIRED
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        if (name == null){ // if the name is not set then assign "Unknown" to name
            name = "Unknown";
        }

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){ // if the arg is empty then it will exit
            System.err.println("Invalid student name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("Age cannot be negative: " + age);
            System.exit(1);
        }
        if (age < 5 || age > 90){
            System.err.println("age can not be less than 5 or greater than 90: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        /*if (!(gender == 'M' || gender == 'F')){
            System.err.println("Gender should not be set to any chanarcter other than: 'M' and 'F': " +gender);
            System.exit(1);
        }*/

        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        /*if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F': " + grade);
            System.exit(1);
        }*/
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (isValid){
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying at " + schoolName);
    }


//    public String toString() {
//        return "Student{" +
//                "name='" + getName() + '\'' +
//                ", age=" + getAge() +
//                ", gender=" + getGender() +
//                ", grade=" + getGrade() +
//                ", schoolName='" + getSchoolName() + '\'' +
//                '}';
//    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()



Encapsulation: hiding the data by giving private access modifiers

		getter (READ ONLY): public instance methods
							return type has to match with the data type of the instance variable
							passes no parameters

		setter (WRITE ONLY): public instance methods
							 return type is void
							 passes a parameter

 */
