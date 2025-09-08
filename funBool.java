import java.util.Scanner;

public class funBool {
    
    public static boolean isPrime(int n)
{
    if(n<=1){
        return false;
    }

    for(int i=2;i*i<=n;i++){
        if(n%i==0)
        {
    return false;
}

   
}
     return true;
}
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number To Find Its Prime Or Not: ");
   int num=sc.nextInt();
   
        if(isPrime(num)){
            System.out.println(num+ "prime number :");
        }
        else{
            System.out.println(num + " Not a prime number");
        }
    
}}