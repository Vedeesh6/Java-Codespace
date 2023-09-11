import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_evenbalancedarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum_even=0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x%2==0) sum_even+=x;
        }sc.close();
        System.out.println(sum_even);
    }
}
