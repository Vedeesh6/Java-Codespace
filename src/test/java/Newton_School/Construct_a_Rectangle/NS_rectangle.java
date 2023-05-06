import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_rectangle {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean res=false;
        if(a == b + c || b == a + c || c == a + b){res = true;}
        else if((a % 2 == 0 && b == c) || (b % 2 == 0 && a == c) || (c % 2 == 0 && a == b)){res = true;}
        System.out.println(res ? "Yes" : "No");
    }
}
