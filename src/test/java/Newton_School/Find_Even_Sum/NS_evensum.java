import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_evensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(C(sc.nextInt(),2)+C(sc.nextInt(),2));
    }

    public static int C(int n, int r){
        if(n<r) return 0;
        if(r==0 || n==r) return 1;
        return C(n-1,r-1)+C(n-1,r);
    }
}
