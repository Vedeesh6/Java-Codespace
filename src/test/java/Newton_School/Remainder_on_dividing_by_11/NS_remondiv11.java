import java.math.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_remondiv11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        System.out.println(n.mod(BigInteger.valueOf(11)));
    }
}
