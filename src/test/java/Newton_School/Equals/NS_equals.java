import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_equals{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int diff=sc.nextInt()-sc.nextInt();sc.close();
        if(diff==0) System.out.println(0);
        else if((diff<0 && Math.abs(diff)%2==1) || (diff>0 && diff%2==0)) System.out.println(1);
        else System.out.println(2);
    }
}
