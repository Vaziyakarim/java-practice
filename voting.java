import java.util.Scanner;
public class voting{
    public static void main(String[] args){
        System.out.println("please enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("your age:"+age);
        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else if(age==17){
            System.out.println("wait for one more year");
        }

        
        else{
            System.out.println("you are not eligible to vote");
        }
    }}