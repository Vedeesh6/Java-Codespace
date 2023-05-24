import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_oddisland {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();sc.close();
        if(k%2==0 && n%2==1 || k%2==1 && n%2==0 || k>n || k*k>n) System.out.println("NO");
        else System.out.println("YES");
    }
}
