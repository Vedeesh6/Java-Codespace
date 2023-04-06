import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_beans {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),b=sc.nextInt(),d=sc.nextInt();
        if(r<b){int t=r;r=b;b=t;}
        System.out.println((r-b)<=(b*d)?"Yes":"No");
    }
}
