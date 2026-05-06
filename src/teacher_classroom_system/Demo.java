package teacher_classroom_system;

public class Demo {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("Java Class:");

        Teacher t1 = new Teacher(101, "Sokpheng");
        Teacher t2 = new Teacher(102, "Chipor");
        Teacher t3 = new Teacher(101, "Bubu");

        classroom.addTeacher(t1);
        classroom.addTeacher(t2);
        classroom.addTeacher(t3);

        classroom.displayTeachers();
        classroom.searchTeacher();
    }
}
