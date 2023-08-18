import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class NS_vikasprime {
    static ArrayList<Integer> prime = new ArrayList<Integer>();

    public static void main(String[] args) {
        SieveOfEratosthenes(1000000);
        prime(new Scanner(System.in).nextInt());
    }

    private static void SieveOfEratosthenes(int i) {
        boolean[] prime_b = new boolean[i + 1];
        for (int j = 0; j < i; j++) {
            prime_b[j] = true;
        }
        for (int p = 2; p * p <= i; p++) {
            if (prime_b[p] == true) {
                for (int j = p * p; j <= i; j += p) {
                    prime_b[j] = false;
                }
            }
        }
        for (int p = 2; p <= i; p++) {
            if (prime_b[p] == true) {
                prime.add(p);
            }
        }
    }

    private static void prime(int n) {
        for(int i=0;i<prime.size();i++){
            if(prime.get(i)<=n){
                System.out.print(prime.get(i)+" ");
            }
        }
    }
}
