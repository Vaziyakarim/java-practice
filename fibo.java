import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        System.out.println("Enter number of terms:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+"");
            int next=a+b;
            a=b;
            b=next;
        }
    }
    
}
