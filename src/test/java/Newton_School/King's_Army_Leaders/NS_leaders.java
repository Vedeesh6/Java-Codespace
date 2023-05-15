import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_leaders{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }sc.close();
        int count_a=1,count_b=1,max_a=a[n-1],max_b=b[m-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]>=max_a){
                max_a=a[i];
                count_a++;
            }
        }
        for(int i=m-2;i>=0;i--){
            if(b[i]>=max_b){
                max_b=b[i];
                count_b++;
            }
        }
        System.out.println((count_a>count_b)?1:2);
    }
}
