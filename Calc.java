import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation(add,sub,mul,div) -");
        String op = sc.nextLine();
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        switch (op){
            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "mul":
                System.out.println(a*b);
                break;
            case "div":
                if(b==0){
                    System.out.println("Math Error");
                }
                else{
                    System.out.println(a/b);
                }
                break;
            default:System.out.println("Invlaid input");
        }

    }
}
