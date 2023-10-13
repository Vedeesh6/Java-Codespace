import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_seclargestprime {
    static ArrayList<Integer> erasthonus= new ArrayList<Integer>();

    public static void sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (prime[i]) {
                erasthonus.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve(1000000);
        int n=sc.nextInt(),index=0;sc.close();
        for(int i=0;i<erasthonus.size();i++){
            if(erasthonus.get(i)>n){
                index=i;
                break;
            }
        }
        System.out.println(erasthonus.get(index-2));
    }
}
