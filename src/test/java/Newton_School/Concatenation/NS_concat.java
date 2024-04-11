import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_concat {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(new StringBuilder(new StringBuilder(sc.next()).reverse()+"-"+new StringBuilder(sc.next()).reverse()).reverse().toString());
    }
}
