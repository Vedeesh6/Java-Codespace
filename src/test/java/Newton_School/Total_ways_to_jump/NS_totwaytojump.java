import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_totwaytojump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < n+1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3]) % 1000000007;
        }
        System.out.println(arr[n]);
    }
}
