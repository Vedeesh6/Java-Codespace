import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_missdigit{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();sc.close();
        int n=s.length(),sum=0,sum_o=45;
        for(int i=0;i<n;i++) sum+=s.charAt(i)-'0';
        System.out.println(sum_o-sum);
    }
}
