import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_closestpower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println(n);
            return;
        }
        int lower=n-1,upper=n+1;
        while(true){
            if(isPowerOfTwo(lower)){
                System.out.println(lower);
                return;
            }
            if(isPowerOfTwo(upper)){
                System.out.println(upper);
                return;
            }
            lower--;
            upper++;
        }
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }
}
