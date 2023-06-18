import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_hittarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt(); long ans=sc.nextLong();
            for(int i=1;i<n;i++){
                int ele=sc.nextInt();
                ans=(ans*ele)/gcd(ans,ele);
            }
            System.out.println(ans);
        }
    }

    private static long gcd(long ans, long i) {
        if(i==0){
            return ans;
        }
        return gcd(i,ans%i);
    }
}
