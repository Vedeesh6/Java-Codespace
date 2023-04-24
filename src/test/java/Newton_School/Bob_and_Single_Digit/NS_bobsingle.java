import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_bobsingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();sc.close();
        System.out.println(sumofDigits(s));
    }

    private static String sumofDigits(String s) {
        while(s.length()>1){
            int sum = 0;
            for(int i=0;i<s.length();i++){
                sum += s.charAt(i)-'0';
            }
            s = String.valueOf(sum);
        }
        return s;
    }
}
