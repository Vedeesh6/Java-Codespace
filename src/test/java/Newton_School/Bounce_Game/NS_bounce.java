import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_bounce {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) if(i==0) a[i]=sc.nextInt(); else a[i]=a[i-1]+sc.nextInt();
        sc.close();int count=1;
        for(int i=0;i<n;i++) if(a[i]<=x) {count++;}
        System.out.println(count);
    }
}
