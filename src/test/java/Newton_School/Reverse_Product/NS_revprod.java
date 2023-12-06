import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_revprod{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());sc.close();
        String num=sb.toString(),rev_num=sb.reverse().toString();
        System.out.println(Integer.parseInt(num)*Integer.parseInt(rev_num));
    }
}
