import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_nosub0  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int[] dp = new int[n+1];
        for(int i=0;i<n;i++){
            int count=0;
            while(i<n && arr[i]==0){
                count++;
                i++;
            }
            //System.out.println(count);
            if(count>0){
                for(int j=1;j<=count;j++){
                    dp[j]+=count-j+1;
                }
            }
        }
        int ans=0;
        //for(int i=0;i<n+1;i++) System.out.print(dp[i]+" ");
        for(int i=0;i<n+1;i++) ans+=dp[i];
        System.out.println(ans);
    }
}
