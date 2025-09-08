import java.util.Scanner;
public class funSq {
    public static int Square(int n){

        return n*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter number to find Square: ");
     int num=sc.nextInt();
     int sq=Square(num);
     System.out.println("the square of "+num + " is " +sq);
     

    }
    
}
