import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_allonce {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            sum+=arr[i]=sc.nextInt();
        }sc.close();boolean flag = false;
        if(sum%n==0){
            int avg=sum/n;
            for (int i = 0; i < n; i++) {
                if(arr[i]==avg){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag?"Yes":"No");
    }
}
