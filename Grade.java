import java.util.Scanner;

public class Grade {

    static String calculateGrade(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double avg = sum / (double) marks.length;

        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        String grade = calculateGrade(marks);
        System.out.println(name + "'s Grade: " + grade);

        sc.close();
    }
}
