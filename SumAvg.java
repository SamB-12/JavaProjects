import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        int[] a={1,5,29,36,42,88,99};
        int sum=0;
        for(int i=0;i< a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("sum = "+sum);
        float avg=sum/ a.length;
        System.out.println("Average ="+avg);
    }
}
