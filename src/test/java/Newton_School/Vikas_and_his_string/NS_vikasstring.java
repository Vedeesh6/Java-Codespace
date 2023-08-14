import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_vikasstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();sc.close();
        int count_upper=0,count_lower=0;
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                count_upper++;
            }
            else if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                count_lower++;
            }
        }
        System.out.println(count_lower>count_upper?s.toLowerCase():s.toUpperCase());
    }
}
