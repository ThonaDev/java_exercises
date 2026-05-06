package teacher_classroom_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    String className;
    ArrayList<Teacher> teachers;

    public Classroom(String className){
        this.className = className;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher){
        for (Teacher t : teachers){
            if(t.id == teacher.id){
                System.out.println("Teacher ID already exist! Cannot add.");
                return;
            }
        }
        teachers.add(teacher);
        System.out.println("Teacher added successfully!");
    }

    public void displayTeachers(){
        System.out.println("Room name: " + className);
        System.out.println("Teacher List:");

        for (Teacher t : teachers){
            System.out.println("Name: " + t.name + ", ID: " + t.id);
        }
    }

    public void searchTeacher(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter id to search: ");
            int tId = scanner.nextInt();

            boolean found = false;

            for (Teacher t : teachers){
                if(tId == t.id){
                    System.out.println("Teacher found:");
                    System.out.println("ID: " + t.id);
                    System.out.println("Name: " + t.name);
                    found = true;
                    break;
                }
            }

            if(found){
                break; // ✅ stop the while loop when found
            } else {
                System.out.println("Not found!!");
                System.out.print("Try again? (y/n): ");
                String choice = scanner.next(); // read user input

                if(choice.equalsIgnoreCase("n")){
                    break; // exit loop if user says no
                }
            }
        }
    }
}
