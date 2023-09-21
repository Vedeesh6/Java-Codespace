import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_evenpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            } else {
                odd.add(a[i]);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        int evenSum = -1;
        int oddSum = -1;
        if (even.size() >= 2) {
            evenSum = even.get(0) + even.get(1);
        }
        if (odd.size() >= 2) {
            oddSum = odd.get(0) + odd.get(1);
        }

        int ans = Math.max(evenSum, oddSum);
        System.out.println(ans);
    }
}
