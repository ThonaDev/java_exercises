package student_course_system;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Student> students;

    public Course(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        System.out.println("Course: " + courseName);
        System.out.println("Student List:");

        for (Student s : students){
            System.out.println("ID: " + s.id + ", Name: " + s.name);
        }
    }
}
