import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
public class NS_pendletonpengpath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();sc.close();
        int n=s.length(),count_L=0,count_R=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L') count_L++;
            else if (s.charAt(i)=='R') count_R++;
        }
        System.out.println(n-Math.min(count_L, count_R)*2);
    }
}
