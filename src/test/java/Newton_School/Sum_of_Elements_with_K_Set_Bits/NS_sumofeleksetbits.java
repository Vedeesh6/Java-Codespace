import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sumofeleksetbits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
        int k=sc.nextInt(),sum=0;
        for(int i=0;i<n;i++){
            if(Integer.bitCount(i)==k) sum+=A[i];
        }
        System.out.println(sum);
    }
}
