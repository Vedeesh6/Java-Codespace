import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_prodofrevno {
    public static void main (String[] args) {
        StringBuilder sb=new StringBuilder(new Scanner(System.in).next());
        System.out.print(Integer.parseInt(sb.toString())*Integer.parseInt(sb.reverse().toString()));
    }
}
