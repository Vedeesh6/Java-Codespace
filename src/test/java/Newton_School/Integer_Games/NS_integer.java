import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(n-countRepresentable(n));
    }

    public static int countRepresentable(long N) {
        HashSet<Long> representables = new HashSet<>();
        int count = 0;
        for (long p = 2; p*p <= N; p++) {
            for (long k = 2; Math.pow(p, k) <= N; k++) {
                long representable = (long) Math.pow(p, k);
                if (!representables.contains(representable)) {
                    representables.add(representable);
                    count++;
                }
            }
        }
        return count;
    }
}
