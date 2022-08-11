import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {
        int a,b,add,sub,mult;
        double div;
        Scanner java=new Scanner(System.in);
        System.out.println("Enter a value of a to add :");
        a=java.nextInt();
        System.out.println("Enter a value of b to add :");
        b=java.nextInt();
       add=a+b;
        System.out.println("The Addition Output is " + add+ "." );
       System.out.println("Enter the value of a to subtract:");
       a=java.nextInt();
       System.out.println("Enter the value of b to subtract :");
       b=java.nextInt();
       sub=a-b;
        System.out.println("The Subtraction Output is "+sub+".");

        System.out.println("Enter the value of a to multiply :");
        a=java.nextInt();
        System.out.println("Enter the value of b to multiply :");
        b=java.nextInt();
        mult=a*b;
        System.out.println("The Multiplication Output is "+mult+".");
        System.out.println("Enter the value of a to divide :");
        a=java.nextInt();
        System.out.println("Enter the value of b to divide :");
        b=java.nextInt();
        div=(double) a/b;
        System.out.println("The divison Output is "+div+".");



    }

}
