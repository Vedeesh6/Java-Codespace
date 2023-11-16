import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_meethrtarget{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target=sc.nextInt(),count=0;sc.close();
        for(int i=0;i<n;i++) {
            if(arr[i]>=target) count++;
        }
        System.out.println(count);
    }
}
