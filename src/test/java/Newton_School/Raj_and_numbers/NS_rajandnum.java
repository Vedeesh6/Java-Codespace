import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_rajandnum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((Integer.toString(sc.nextInt(), sc.nextInt())+"").length());
    }
}
