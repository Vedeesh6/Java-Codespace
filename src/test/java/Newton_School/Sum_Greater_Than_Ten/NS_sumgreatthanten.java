import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class you can add inner classes if needed
class NS_sumgreatthanten {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println(a+b>=10 || b+c>=10 || c+a>=10 ? "YES" : "NO");
    }
}
