import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_evathestring2{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Integer.valueOf(s.substring(0,s.indexOf("+")))+Integer.valueOf(s.substring(s.indexOf("+")+1)));
    }
}
