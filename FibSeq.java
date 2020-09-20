import java.util.Scanner;

public class FibSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms upto which fib must be displayed-");
        int count = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int i=0;
        while(i<=count){
            System.out.println(num1+" ");
            int Sum2=num1+num2;
            num1=num2;
            num2=Sum2;
            i++;

        }
    }
}
