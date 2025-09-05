import java.util.Scanner;

public class multiple {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to find multiplication table");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
          int prod=  i*n;
            System.out.println(n + " * " + i + " = "+ prod);
        }
    }
}
