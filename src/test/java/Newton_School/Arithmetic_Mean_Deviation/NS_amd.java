import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_amd {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a = new int[3];
        for (int j = 0; j < 3; j++) a[j] = in.nextInt();
        in.close();
        int d = Math.abs(a[0] + a[2] - 2 * a[1])%3;
        System.out.println((d==2)?1:d);
    }
}
