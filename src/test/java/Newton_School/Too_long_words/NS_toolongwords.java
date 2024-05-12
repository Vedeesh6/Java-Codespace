import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_toolongwords {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();int len=s.length();
            System.out.println(len>10?(char)s.charAt(0)+((len-2)+"")+s.charAt(len-1):s);
        }
    }
}
