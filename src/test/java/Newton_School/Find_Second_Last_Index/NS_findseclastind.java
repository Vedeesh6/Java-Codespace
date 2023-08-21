import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_findseclastind {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0,x=sc.nextInt();sc.close();
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                count++;
            }
            if(count==2){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}
