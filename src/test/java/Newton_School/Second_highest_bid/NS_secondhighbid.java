import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_secondhighbid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=0,big=0,in=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>big){
                in=i;
                ans=big;
                big=x;
            }else if(x==big){
                ans=big;
            }else if(x>ans){
                ans=x;
            }
        }
        System.out.println((in+1)+" "+ans);
    }
}
