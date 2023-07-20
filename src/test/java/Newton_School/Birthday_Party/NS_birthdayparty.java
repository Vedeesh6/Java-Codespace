import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_birthdayparty {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong(),k=sc.nextLong();sc.close();
		System.out.println(lcm(n,k)/k);
	}

	private static long lcm(long n, long k) {
		return n*k/gcd(n,k);
	}

	private static long gcd(long n, long k) {
		if(k==0) return n;
		return gcd(k,n%k);
	}
}
