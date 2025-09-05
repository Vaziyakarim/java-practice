import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num");
         int num1=sc.nextInt();
          System.out.println("Enter 2nd num");
          int num2=sc.nextInt();
         System.out.println("Before swap number1 "+ num1 +" And number2 " +num2);
         num1=num1+num2;
         num2=num1-num2;
         num1=num1-num2;
          System.out.println("After swap number1 "+ num1 +" And number2 " +num2);

    }
}
