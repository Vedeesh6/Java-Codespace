import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_edward {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong(),m=sc.nextLong();sc.close();
		double arg=(double) m/n;
		if (arg<2 || (arg%2!=0 && arg%3!=0)){
			System.out.println((arg==1)?0:-1);
		}
		else{
			int count=0;
			while(arg!=1 && (arg%2==0 || arg%3==0)){
				if (arg%2==0){
					arg/=2;
				}
				else if (arg%3==0){
					arg/=3;
				}
				count++;
				//System.out.println(arg);
			}
			System.out.println((arg==1)?count:-1);
		}
	}
}
