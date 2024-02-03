import java.util.*;

public class NS_ordarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        Set<Long> secret = new HashSet<>();
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            secret.add(arr[i]);
        }

        Arrays.sort(arr);

        if (secret.size() > 2) {
            System.out.println("No");
        } else if (secret.size() == 1) {
            System.out.println("Yes");
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] == arr[0]) {
                    cnt1++;
                }
                if (arr[i] == arr[n - 1]) {
                    cnt2++;
                }
            }

            if (cnt1 == cnt2 || Math.abs(cnt1 - cnt2) == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
