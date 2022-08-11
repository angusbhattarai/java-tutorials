public class IfIfIfCondition {
    public static void main(String[]args){
        int a=50,b=60,c=70,d=80;
        if(a>=b && a>=c && a>=d){
            System.out.println("a is greater");
        }
        if(b>=c && b>=a && b>=d){
            System.out.println("b is greater");
        }
        if(c>=a && c>=b && c>=d){
            System.out.println("c is greater");
        }
        else{
            System.out.println("D is greater");
        }
    }
}
