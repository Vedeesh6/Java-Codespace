import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_distchocs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        sc.close();
        System.out.println(sum<n || (k==0 && sum%n!=0) ? "No" : "Yes");
    }
}
