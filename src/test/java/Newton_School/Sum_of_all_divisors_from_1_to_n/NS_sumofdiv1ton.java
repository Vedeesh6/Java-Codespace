import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

public class NS_sumofdiv1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.close();
        BigInteger sum = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    sum=sum.add(BigInteger.valueOf(j));
                    if(i/j!=j) sum=sum.add(BigInteger.valueOf(i/j));
                }
            }
        }
        System.out.println(sum);
    }
}
