import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_equiinarray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        System.out.println(sum%2==0?"Yes":"No");
    }
}
