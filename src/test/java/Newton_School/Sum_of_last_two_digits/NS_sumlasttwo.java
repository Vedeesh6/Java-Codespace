import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_sumlasttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();int len=n.length(),sum=0;
        for(int i=len-1;i>=len-2;i--) sum+=n.charAt(i)-'0';
        System.out.println(sum);
    }
}
