public class MethOverload {
    public void meth1(int x,int y){
        int c=x+y;
        System.out.println("the square of the sum of two numbers is="+c*c);
    }
    public void meth1(int x,int y,int z){
        int c=x+y+z;
        System.out.println("the square of the sum of three numbers is="+c*c);
    }
    public void meth1(int x,int y,int z,int w){
        int c=x+y+z+w;
        System.out.println("the square of the sum of four numbers is="+c*c);
    }

    public static void main(String[] args) {
        MethOverload meh = new MethOverload();
        meh.meth1(2,3);
        meh.meth1(2,3,5);
        meh.meth1(16,32,64,128);
    }
}
