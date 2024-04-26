import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_minnumofmoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=2,second=1,third=1,ans=0;
        for(int i=4;i<=n;i++){
            ans=Math.min(third+2,Math.min(second+1,first+1));
            first=second;second=third;third=ans;
        }
        System.out.println(n==0?0:n==1?2:n==2?1:n==3?1:ans);
    }
}
