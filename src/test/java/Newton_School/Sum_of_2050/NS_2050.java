import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();sc.close();
        if(n%2050!=0) {
            System.out.println(-1);
            return;
        }
        String ans = Long.toString(n/2050);
        System.out.println(sumofdigits(ans));
    }

    private static int sumofdigits(String ans) {
        int sum = 0;
        for(int i=0;i<ans.length();i++) {
            sum += ans.charAt(i)-'0';
        }
        return sum;
    }
}
