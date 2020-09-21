public class Sort {
    public static void main(String[] args) {
        int a[]={12,55,73,42,565,12,44,65,};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp=0;
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("The sorted array is ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
    }

}
