import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean started = false;
        String command = "";

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "start":
                    if (started) {
                        System.out.println("Car is already started");
                    } else {
                        started = true;
                        System.out.println("Car started...");
                    }
                    break;

                case "stop":
                    if (!started) {
                        System.out.println("Car is already stopped");
                    } else {
                        started = false;
                        System.out.println("Car stopped");
                    }
                    break;

                case "help":
                    System.out.println("start - to start the car");
                    System.out.println("stop - to stop the car");
                    System.out.println("quit - to exit");
                    break;

                case "quit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("I don't understand...");
                    break;
            }
        }
    }
}
