import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which fact is required-");
        int count = sc.nextInt();
        int sum=count;
        for(int i=1;i<count;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
