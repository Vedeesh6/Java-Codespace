import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_countnowithkbits {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt(),count=0;sc.close();
        for(int i=0;i<=n;i++) if(Integer.bitCount(i)==k) count++;
        System.out.println(count);
    }
}
