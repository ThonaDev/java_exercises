package student_course_system;

public class Demo {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");

        Student s1 = new Student(1, "Put");
        Student s2 = new Student(2, "Duna");
        Student s3 = new Student(3, "Lava");

        course.addStudent(s1);
        course.addStudent(s2);
        course.addStudent(s3);

        course.displayStudents();
    }
}
