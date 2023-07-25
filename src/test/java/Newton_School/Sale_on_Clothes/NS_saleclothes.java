import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_saleclothes{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1=sc.nextInt(),q=sc.nextInt(),x=sc.nextInt(), p=p1;sc.close();
        p+=(x*p)/100;
        p-=((x*p)/100);
        System.out.println((p1-p)*q);
    }
}
