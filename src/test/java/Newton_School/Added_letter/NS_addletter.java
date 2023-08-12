import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_addletter {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next()+sc.next();
        int xor=0;
        for(int i=0;i<s.length();i++){
            xor^=(int)s.charAt(i);
        }
        System.out.println((char)xor);
    }
}
