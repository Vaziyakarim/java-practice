import java.util.Scanner;
public class prime{
    public static void main(String[] args)
    {
        System.out.println("enter a number to find whether its a prime number or not:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;

        if(n<=1)
{
isprime=false;
}    
else{
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            isprime=false;
        }

        }
    }
    if(isprime){
        System.out.println("The number " +n+ " you have entered is prime number");
    }
    else{
        System.out.println("The number" +n+ " you have entered is not a prime number");
    }
}

}
