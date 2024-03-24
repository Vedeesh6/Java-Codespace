import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_socketsneed {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        if(b==1) System.out.println("0");
        else if(a>=b) System.out.println("1");
        else System.out.println((int)Math.ceil((b-a)/(a-1.0))+1);
        
    }
}
