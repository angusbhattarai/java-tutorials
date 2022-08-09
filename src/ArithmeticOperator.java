import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {
        System.out.println("Enter a value of a :");
        System.out.println("Enter a value of b :");
        Scanner java=new Scanner(System.in);
        int a=java.nextInt();
        int b =java.nextInt();
        int c, d, e, g;
        double f;
        d = a + b;
        c = a - b;
        e = a * b;
        f = (double) a / b;
        g = a % b;
        System.out.println("The Addition Output is " + d + "." + "" +
                "\nThe Subtraction Output is " + c + "." +
                "\nThe Multiplication Output is " + e + "." +
                "\nThe Division Output is " + f + "." +
                "\nThe percentage Output is " + g + ".");
    }

}
