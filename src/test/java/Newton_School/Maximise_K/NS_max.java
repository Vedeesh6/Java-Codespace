import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_max {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = n - 1,and=n&k;
        while (k > 0 && and != 0) {
            k--;
            and&=k;
        }
        System.out.println(k);
    }
}
