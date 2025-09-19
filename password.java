import java.util.Scanner;

public class password{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if(password.length() < 6) {
            System.out.println("Too short!");
        } else if(!password.matches(".*[A-Z].*")) {
            System.out.println("Add an uppercase letter!");
        } else if(!password.matches(".*\\d.*")) {
            System.out.println("Add a number!");
        } else {
            System.out.println("Strong password!");
        }
    }
}
