import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sunnyrainy {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();String S=sc.next();sc.close();
        System.out.println((S.charAt(n-1)=='o')?"Yes":"No");
        
    }
}
