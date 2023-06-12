import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minstones {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt();sc.close();
        System.out.println(s/n+(s%n==0?0:1)); 
    }
}
