import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_goodnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();long arg=Long.parseLong(s);sc.close();
        System.out.println((arg<9)?0:(arg==9)?1:Long.parseLong(s.substring(0, s.length()-1))+(s.charAt(s.length()-1)=='9'?1:0));
    }
}
