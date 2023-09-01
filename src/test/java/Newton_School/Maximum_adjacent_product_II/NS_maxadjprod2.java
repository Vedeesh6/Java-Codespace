import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxadjprod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int prod1=arr[0]*arr[1];
        int prod2=arr[n-1]*arr[n-2];
        System.out.println(prod1>prod2?prod1:prod2);
    }
}
