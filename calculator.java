import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        System.out.println("CALCULATOR");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
          System.out.println("enter b:");
        int b=sc.nextInt();
        System.out.println("enter your choice('+' '-' '*' '/')");
        char op=sc.next().charAt(0);
        System.out.println("you entered:"+op);

        if(op=='+'){
            System.out.println("Added 2 no's:"+(a+b));
        }
else if(op=='-'){
    System.out.println("substracted  2 no's:"+(a-b));
}
else if(op=='*'){
    System.out.println("Multiplied 2 no's:"+(a*b));
}
else if(op=='/'){
    if(b!=0){
        System.out.println("divided  2 no's:"+(a/b));
    }
    else{
        System.out.println("invalid");
    }
}
else{
    System.out.println("Invalid operation");
}

    }
}
