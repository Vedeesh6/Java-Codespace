import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minsumposs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),k = sc.nextInt(),count=0;sc.close();
        while(k-- > 0 && a!=b){
            count++;
            if(b>a){
                int temp = a;
                a = b;b = temp;
            }
            a=count%2==0?lcm(a,b):gcd(a,b);
        }
        System.out.println(a+b);
    }

    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
