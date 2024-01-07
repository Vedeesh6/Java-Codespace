import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_11div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();sc.close();
        System.out.println(mod11(s));
    }

    public static int mod11(String s) {
        int ans = 0;
        int n=s.length();
        for(int i=0;i<n;i++)  ans=(ans*10+(int)(s.charAt(i)-'0'))%11;
        return ans;
    }
}
