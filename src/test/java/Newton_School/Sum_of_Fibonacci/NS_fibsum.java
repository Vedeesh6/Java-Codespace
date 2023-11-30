import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_fibsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.close();
        
        if(n==0) System.out.println(0);
        else if(n==1) System.out.println(1);
        else{
            n-=1;
            int prev=0,curr=1,ans=1;
            while(n-->0){
                int temp=curr;
                curr+=prev;
                prev=temp;
                ans+=curr;
            }
            System.out.println(ans);
        }
    }
}
