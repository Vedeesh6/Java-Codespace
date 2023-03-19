import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_concatsq {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();sc.close();
        int c = Integer.parseInt(a +""+ b);
        System.out.println((Math.sqrt(c)==(int)Math.sqrt(c))?"Yes":"No");
    }
}
