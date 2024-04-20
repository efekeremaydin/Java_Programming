package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup3 { // StudentsGroup3 HAS A Student

    public String groupName;
    public int groupId;
    // public ArrayList<Student> students = new ArrayList<>(); // one way to do this
    public ArrayList<Student> students = new ArrayList<>(); // another way to init tne ArrayList, by using the const below
    // every single students group have different ArrayList of student.
    // you want to add those Students to different ArrayList of students
    // if one class' instance is used in another class that's known as HAS-A relationship

    public StudentsGroup3(String groupName, int groupId) { // you don't need to pass the ArrayList elements within the constructor
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(); // but you need to instantiate the ArrayList otherwise you can't use it later. size: 0
    } // const creates the StudentGroup objects by setting the groupName and groupId


    //   addStudent(Student): adds the specified student to the students arrayList
    public void addStudent(Student student) {
        students.add(student);
    }// Takes one student obj and adds it to the Array List of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }// Takes one array of students, and adds the array of students to the ArrayList of students

    // what if you don't want to craete obj when you add to the array list?
    // another way

    public void addStudent(String name, String id, int age, char gender){
        // Student student = new Student(name, id, age, gender); // no need to create this as it's only used once.
        students.add(new Student(name, id, age, gender));
    } // Takes name age gender and id of the student info, creates student object by using the given info, then adds the student object to the ArrayList of students

    // removeStudent(id): removes the student with the specified id from the students arraylist
    public void removeStudent(String id) {
        students.removeIf(p -> p.id.equals(id));
    }// takes the id and then removes the student obj with the specified id from the Array List of students

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", Total number of students=" + students.size() +
                '}';
    }









}

/*
	2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */
