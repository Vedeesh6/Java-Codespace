import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_rohanandfri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt(),sum=0,max=-1;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            sum+=x;
            max=Math.max(max,x);
        }
        if(sum-max<=s) System.out.println("Yes");
        else System.out.println("No");
    }
}
