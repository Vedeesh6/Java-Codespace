import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_amanpuzzle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(((x/sc.nextInt())+(x/sc.nextInt()))/2);sc.close();
    }
}
