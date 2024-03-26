import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_maxnum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println(Math.max(x+y,Math.max(x-y,x*y)));
    }
}
