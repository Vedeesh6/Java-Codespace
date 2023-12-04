import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

public class NS_fibdiv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max=20000;BigInteger prev = BigInteger.ZERO,curr = BigInteger.ONE;
        if(n==0){
            System.out.println(-1);
            return;
        }

        for(int i=2;i<=max;i++){
            BigInteger temp = curr;
            curr = curr.add(prev);
            prev = temp;
            if(curr.mod(BigInteger.valueOf(n)).equals(BigInteger.ZERO)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
