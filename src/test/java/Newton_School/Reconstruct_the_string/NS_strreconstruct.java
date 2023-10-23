import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_strreconstruct{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();int n=sc.nextInt();
        char[] res=new char[n];
        for(int i=0;i<n;i++) res[sc.nextInt()]=s.charAt(i);
        sc.close();
        System.out.println(new String(res));
    }
}
