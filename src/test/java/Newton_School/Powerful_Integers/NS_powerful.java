import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_powerful {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=10){System.out.println(n);return;}
        int len=(n+"").length();
        System.out.println((len-2)*9+10+Integer.parseInt((n+"").charAt(0)+"")-1);
    }
}
