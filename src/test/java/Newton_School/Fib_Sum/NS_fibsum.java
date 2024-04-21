import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_fibsum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),sum=1,fib[]=new int[n+1];
		fib[0]=0;fib[1]=1;
		for(int i=2; i<n; i++){
			fib[i]=fib[i-1]+fib[i-2];
			sum+=fib[i];
		}
		System.out.println(sum);
	}
}
