import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_addsub {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();sc.close();
        System.out.println((y%x==0)?(y+x):(y-x));
    }
}
