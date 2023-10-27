import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_primearrayduel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum_r=0,sum_t=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) ans.add(sc.nextInt());
        Collections.sort(ans);boolean gate = true;
        for(int i = n-1; i >= 0; i--){
            if(isProbablePrime(ans.get(i))){
                if(gate) sum_r += ans.get(i);
                else sum_t += ans.get(i);
            }
        }
        System.out.println(sum_r>sum_t?"Ravi":(sum_r<sum_t?"Tia":"Draw"));
    }

    public static boolean isProbablePrime(int n) {
        return n > 1 && java.math.BigInteger.valueOf(n).isProbablePrime(1);
    }
}
