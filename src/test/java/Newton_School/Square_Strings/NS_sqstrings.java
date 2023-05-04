import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sqstrings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();sc.close();
        if(s.length()%2!=0){System.out.println("No");}
        else{
            int n=s.length();
            System.out.println((s.substring(0,n/2).equals(s.substring(n/2)))?"Yes":"No");
        }
    }
}
