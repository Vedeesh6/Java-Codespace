import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_favnumscount {
    public static void main (String[] args) {
        String s=new Scanner(System.in).next();int n=s.length(),count=0;
        for(int i=0;i<n;i++) if(s.charAt(i)=='7') count++;
        System.out.println(count);
    }
}
