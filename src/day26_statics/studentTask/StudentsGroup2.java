package day26_statics.studentTask;

import java.util.ArrayList;

public class StudentsGroup2 {

    public String groupName, groupId;
    public ArrayList<String> students;

    public StudentsGroup2(String groupName, String groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        //this.students = students;
    }

    //   addStudent(Student): adds the specified student to the students arrayList
    public void addStudent(String student) {
        students.add(student);
    }

    // removeStudent(id): removes the student with the specified id from the students arraylist
    public void removeStudent(String name) {
        this.students.removeIf(p -> p.equals(name));
    }

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
