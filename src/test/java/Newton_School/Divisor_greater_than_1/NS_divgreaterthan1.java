import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_divgreaterthan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();sc.close();
        if(n%2!=0){
            System.out.println("YES");
            return;
        }
        else{
            System.out.println((isPowerOfTwo(n/2)?"NO":"YES"));
        }
    }

    static boolean isPowerOfTwo(long n)
    {
        return n != 0 && ((n & (n - 1)) == 0);
    }
}
