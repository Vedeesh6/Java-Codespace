import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_amagame {
    // Function to check whether the number is prime or not
    static boolean isPrime(int n) {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        // Using the concept of a prime number
        // can be represented in the form of
        // (6 * n + 1) or (6 * n - 1) hence
        // we have to go for every multiple of 6 and
        // prime number would always be 1 less or 1 more than
        // the multiple of 6.
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    static int primeFactors(int n) {
        // to store the count of prime factors
        int ans = 0;
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            ans++;
            n = n / 2;
        }

        // n must be odd at this point. So we can skip
        // one element (Note i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                ans++;
                n = n / i;
            }
        }

        // This condition is to handle the case when n
        // is a prime number greater than 2
        if (n > 2)
            ans++;
        return ans;
    }

    // Function to find which player will win
    static boolean brainGame(ArrayList<Integer> nums) {
        ArrayList<Integer> a = new ArrayList<>(Collections.nCopies(1005, 0));
        for (int i = 2; i <= 1000; i++) {
            if (!isPrime(i)) {
                a.set(i, primeFactors(i) - 1);
            }
        }
        int x = 0;
        for (int i = 0; i < nums.size(); i++) {
            x = x ^ a.get(nums.get(i));
        }
        return x != 0;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> nums=new ArrayList<>();
        while(n-->0) nums.add(sc.nextInt());
        if (brainGame(nums)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
