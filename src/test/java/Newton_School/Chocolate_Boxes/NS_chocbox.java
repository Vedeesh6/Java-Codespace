import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_chocbox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),w=sc.nextInt(),box=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0,j=n-1;i<=j;){
            if(a[i]+a[j]<=w)
                i++;
            box++;
            j--;
        }
        System.out.println(box);
    }
}
