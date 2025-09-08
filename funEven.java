import java.util.Scanner;

public class funEven{
    public static void printEven(int n){
   for(int i=2;i<=n;i++){
    if(i%2==0){
        System.out.println(i +"");
    }
   }}
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter number  ");
     int num=sc.nextInt();

     
          printEven(num);
     
   }

}