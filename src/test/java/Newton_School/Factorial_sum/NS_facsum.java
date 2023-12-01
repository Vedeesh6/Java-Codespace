import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_facsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();long sum=0;
        for(int i=0;i<s.length();i++){
            sum+=factorial(s.charAt(i)-'0');
        }
        System.out.println(sum);
    }

    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
