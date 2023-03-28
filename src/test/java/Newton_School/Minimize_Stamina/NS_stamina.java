import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_stamina {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= arr[i] = sc.nextInt();
        }int avg=(sum/n< (int)((double) sum/n+0.5))?sum/n+1:sum/n;
        int ans=0;sc.close();
        for(int i=0;i<n;i++){
            ans+=Math.pow((arr[i]-avg), 2);
        }
        System.out.println(ans);
    }
}
