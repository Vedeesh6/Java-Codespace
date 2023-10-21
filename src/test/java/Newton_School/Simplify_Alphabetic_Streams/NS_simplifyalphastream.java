import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_simplifyalphastreams{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg=sc.next(),res=arg.charAt(0)+"";
        int n=arg.length();sc.close();
        for(int i=1;i<n;i++) if(arg.charAt(i)!=arg.charAt(i-1)) res+=arg.charAt(i);
        System.out.println(res);
    }
}
