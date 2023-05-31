import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_moviepuzzle {
    public static void main(String[] args) {
        System.gc();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long in[]=new long[n], out[]=new long[n];
        for(int i=0; i<n; i++) {
            in[i]=sc.nextLong();
            out[i]=sc.nextLong();
        }sc.close();
        Arrays.sort(in); Arrays.sort(out);
        int i=0, j=0, max=0, count=0;
        while(i<n && j<n) {
            if(in[i]<=out[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            max=Math.max(max, count);
        }
        System.out.println(max);
    }
}
