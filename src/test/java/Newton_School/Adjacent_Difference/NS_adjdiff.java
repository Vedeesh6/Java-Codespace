import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_adjdiff {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();int n=s.length(),sum=0;
        if(n==1){s+="0";n++;}
        for(int i=0;i<n-1;i++){
            sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        System.out.println(sum);
    }
}
