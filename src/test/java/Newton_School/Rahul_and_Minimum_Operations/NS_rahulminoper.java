import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_rahulminoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max=sc.nextInt();
        long change=0;
        for(int i=1;i<n;i++){
            int temp=sc.nextInt();
            change+=Math.max(0, max-temp);
            max=Math.max(max, temp);
        }sc.close();
        System.out.println(change);
    }
}
