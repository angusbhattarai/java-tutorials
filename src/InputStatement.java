import java.util.Scanner;

public class InputStatement {
    public static void main(String[] args){

        System.out.println("Enter a value of a :");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("The value is "+a);


        System.out.println("Enter a value of b :");
        Scanner bvalue=new Scanner(System.in);
        int b=bvalue.nextInt();
        System.out.println("The value of b is:"+b);
    }
}
