import java.math.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_yesorno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt();
        System.out.println(r<4?"No":(l==r)?isPrime(l)?"No":"Yes":"Yes");
    }

    public static boolean isPrime(int n){
        BigInteger b=new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
}
