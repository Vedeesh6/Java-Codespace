import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_minopertomakeequal {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(solve(sc.nextInt(),sc.nextInt()));
    }
    public static int solve(int a, int b) {
        return (((a&b)!=a?1:0)+((a&b)!=b?1:0));
    }

}
