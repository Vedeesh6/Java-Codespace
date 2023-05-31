import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_anishachoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();String s=sc.next();sc.close();
        int max=0;
        for(int i=1;i<n;i++){
            int count=0;
            while(i<n && s.charAt(i)==s.charAt(i-1)){
                count++;
                i++;
            }
            max=Math.max(max,count);
        }
        System.out.println(max+1);
    }
}
