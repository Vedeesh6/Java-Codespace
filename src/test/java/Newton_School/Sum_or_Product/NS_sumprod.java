import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_sumprod {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();sc.close();
		if(n%2==0){
			int sum=0;
			for(int i=0;i<(n+"").length();i++){
				sum+=(n+"").charAt(i)-'0';
			}
			System.out.println(sum);
		}else{
			int prod=1;
			for(int i=0;i<(n+"").length();i++){
				prod*=(n+"").charAt(i)-'0';
			}
			System.out.println(prod);
		}
    }
}
