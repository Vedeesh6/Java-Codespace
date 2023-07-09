import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_oddsum {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		String n=sc.nextInt()+"";sc.close();
		int sum=0;
		for(int i=0;i<n.length();i++) {
			int x=n.charAt(i)-'0';
			if(x%2!=0) sum+=x;
		}
		System.out.println("8".repeat(sum));
	}
}
