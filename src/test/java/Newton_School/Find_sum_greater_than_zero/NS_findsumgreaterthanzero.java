import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findsumgreaterthanzero {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        System.out.println(sum==0?2:sum%2);
    }
}
