import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findvalofstring {
    public static void main (String[] args) {
        String str=new Scanner(System.in).next();
        System.out.println(Integer.parseInt(str.substring(0, str.indexOf("+")))+Integer.parseInt(str.substring(str.indexOf("+")+1, str.length())));
    }
}
