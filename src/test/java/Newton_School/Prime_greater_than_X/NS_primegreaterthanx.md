import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_primegreaterthanx {
    static ArrayList<Integer> sieve = new ArrayList<>();
    static void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int p = 2; p <= n; p++) {
            if (prime[p] == true)
                sieve.add(p);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sieveOfEratosthenes(100000);
        for(int i=0;i<sieve.size();i++){
            if(sieve.get(i)>=x){
                System.out.println(sieve.get(i));
                break;
            }
        }
    }
}
