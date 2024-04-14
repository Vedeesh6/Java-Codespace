import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findmissingdigit {
    public static void main (String[] args) {
        String s=new Scanner(System.in).next();int sum=0;
		for(int i=0;i<s.length();i++) sum+=s.charAt(i)-'0';
		System.out.println(45-sum);
    }
}
