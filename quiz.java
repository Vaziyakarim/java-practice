import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which of these is a Java keyword?\n(a) function\n(b) static\n(c) voids\n(d) integer",
            "2. What is the size of int in Java?\n(a) 4 bytes\n(b) 2 bytes\n(c) 8 bytes\n(d) 1 byte",
            "3. Which method is the entry point of a Java program?\n(a) start()\n(b) main()\n(c) run()\n(d) init()"
        };

        char[] answers = {'b', 'a', 'b'};  // correct answers

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
        sc.close();
    }
}
