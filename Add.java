public class Add {
    public static void main(String[] args) {
        int a[][]={{2,4,6},{8,12,15},{32,64,86}};
        int b[][]={{5,3,1},{85,22,14},{19,53,99}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(c[i][j]+ "  ");
            }
            System.out.print("\n");
        }
    }
}
