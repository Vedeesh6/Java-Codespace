import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minbagsreq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), weight = sc.nextInt();
        int[] ns = new int[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(ns);
        int max = 0,sum=0;
        for(int j=n-1;j>=0;j--){
            if(sum<weight){
                sum+=ns[j];
                max++;
            }
            else break;
        }
        System.out.println(sum>=weight?max:-1);
    }
}
