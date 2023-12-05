import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_evenoddpair{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();int odd=0,even=0;sc.close();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0) even++;
            else odd++;
        }
        System.out.println(Math.min(odd,even));
    }
}
