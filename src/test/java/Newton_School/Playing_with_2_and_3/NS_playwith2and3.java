import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_playwith2and3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(),m=sc.nextLong();sc.close();
		if(m%n!=0) System.out.println(-1);
		else{
			long ans = 0;
			long x = m/n;
			while(x%2==0){
				x/=2;
				ans++;
			}
			while(x%3==0){
				x/=3;
				ans++;
			}
			if(x!=1) System.out.println(-1);
			else System.out.println(ans);
		}
    }
}
