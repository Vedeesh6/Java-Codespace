import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_ismedian {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();sc.close();
        System.out.println(((a<=b && c>=b) || (a>=b && c<=b))?"Yes":"No");
    }
}
