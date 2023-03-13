import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_repeatstring {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),s1="";sc.close();
        while(s1.length()<6){
            s1+=s.repeat(1);
        }
        System.out.println(s1);
    }
}
