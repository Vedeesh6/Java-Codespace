import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_rajassignment {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        System.out.println(m-sum>=0?m-sum:-1);
    }
}
