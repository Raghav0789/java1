import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st no.");
        int x=s.nextInt();
        System.out.println("enter 2nd no.");
        int y=s.nextInt();
        System.out.println("select option ");
        System.out.println("+,-,*,%,/");
        char input = s.next().charAt(0);
        switch (input) {
            case '+':
            System.out.println(x+y);
            break;
            case '-':
            System.out.println(x-y);
            break;
            case '*':
            System.out.println(x*y);
            break;
            case '/':
            System.out.println(x/y);
            break;
            case '%':
            System.out.println(x%y);
            break;
        
            default:
            System.out.println("error");
                break;
        }


    }    
}
