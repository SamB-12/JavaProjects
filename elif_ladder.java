import java.util.Scanner;

public class elif_ladder {
    public static void main(String[] args) {
        System.out.println("Enter the number-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n>=2 && n<=5){
            System.out.println("Not Werid");
        }
        else if(n>=6 && n<=20){
            System.out.println("Werid");
        }
        else{
            System.out.println("Not Werid");
        }
    }

}
