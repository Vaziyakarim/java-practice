
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter grade: ");
        String grade = sc.nextLine();
        students.add(new Student(name, age, grade));
        System.out.println(name + " added successfully!\n");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println((i+1) + ". Name: " + s.name + ", Age: " + s.age + ", Grade: " + s.grade);
        }
        System.out.println();
    }

    static void searchStudent() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.println("Found: Name: " + s.name + ", Age: " + s.age + ", Grade: " + s.grade + "\n");
                return;
            }
        }
        System.out.println("No student named " + name + " found.\n");
    }

    static void updateStudent() {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new name: ");
                s.name = sc.nextLine();
                System.out.print("Enter new age: ");
                s.age = Integer.parseInt(sc.nextLine());
                System.out.print("Enter new grade: ");
                s.grade = sc.nextLine();
                System.out.println("Updated successfully!\n");
                return;
            }
        }
        System.out.println("No student named " + name + " found.\n");
    }

    static void deleteStudent() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equalsIgnoreCase(name)) {
                students.remove(i);
                System.out.println(name + " deleted successfully!\n");
                return;
            }
        }
        System.out.println("No student named " + name + " found.\n");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": addStudent(); break;
                case "2": displayStudents(); break;
                case "3": searchStudent(); break;
                case "4": updateStudent(); break;
                case "5": deleteStudent(); break;
                case "6": System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid choice!\n");
            }
        }
    }
}
