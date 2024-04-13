import java.util.*;
import java.lang.*;
import java.io.*;
class NS_removekchar {
    static String largestString(String num, int k) {
        String ans = "";

        for (char i: num.toCharArray()) {

            while (ans.length() > 0 && ans.charAt(ans.length() - 1) < i && k > 0) {
                ans = ans.substring(0, ans.length() - 1);

                k--;
            }

            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) throws java.lang.Exception {
        int k;
        String s;

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        k = sc.nextInt();

        System.out.print(largestString(s, k) + "\n");
    }
}
