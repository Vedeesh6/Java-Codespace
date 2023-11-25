import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_diffchar{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase(),b=sc.next().toLowerCase();
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))
                c++;
        }
        System.out.println(c);
    }
}
