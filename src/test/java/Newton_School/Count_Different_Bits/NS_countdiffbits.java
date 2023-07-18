import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_countdiffbits {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		long s=sc.nextLong()^sc.nextLong();sc.close();
		System.out.println(countsetbits(s));
	}

	private static int  countsetbits(long s) {
		int count=0;
		while(s>0){
			s&=(s-1);
			count++;
		}
		return count;
	}
}
