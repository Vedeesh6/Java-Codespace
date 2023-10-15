import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxdiagsum{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();sc.close();
        System.out.println(Math.min((n*2+(n%2==0?0:-1)),k));
    }
}
