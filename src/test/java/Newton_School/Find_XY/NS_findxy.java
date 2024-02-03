import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

// don't change the name of this class
// you can add inner classes if needed
class NS_findxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        BigInteger a = BigInteger.valueOf(n);
        a=a.multiply(BigInteger.valueOf(2));
        if(a.compareTo(BigInteger.valueOf(m))==-1 || a.compareTo(BigInteger.valueOf(m))==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
