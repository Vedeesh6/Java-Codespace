import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_smallestrange1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>max) max=x;
            if(x<min) min=x;
        }
        int k=sc.nextInt(),diff=(max-min)-2*k;
        System.out.println(diff>0?diff:0);
    }
}
