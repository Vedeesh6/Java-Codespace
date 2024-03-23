import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.*;

// don't change the name of this class
// you can add inner classes if needed
class NS_teamdinner {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        System.out.println(new DecimalFormat("0.00").format((sum*1.0)/7));
    }
}
