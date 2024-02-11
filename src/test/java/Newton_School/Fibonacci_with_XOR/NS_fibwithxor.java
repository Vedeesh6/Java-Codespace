import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_fibwithxor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int temp=a;
            a^=b;
            b=temp;
        }
        System.out.println(a);
    }
}
