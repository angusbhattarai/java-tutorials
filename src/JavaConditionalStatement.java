import java.util.Scanner;

public class JavaConditionalStatement {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input number");
        int input= in.nextInt();
        if (input>0){
            System.out.println("It is positive number");
        }
        else if (input<0) {
            System.out.println("It is negative number");

        }
        else {
            System.out.println("It is zero");
        }

    }
}
