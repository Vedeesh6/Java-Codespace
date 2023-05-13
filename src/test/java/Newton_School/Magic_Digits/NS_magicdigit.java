import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_magicdigit{
    public static int func(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        int cnt = 1;
        if (s.length() != 1) {
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }
            while (sum >= 10) {
                int ans = sum;
                sum = func(ans);
                cnt++;
            }
            System.out.println(cnt);
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}
