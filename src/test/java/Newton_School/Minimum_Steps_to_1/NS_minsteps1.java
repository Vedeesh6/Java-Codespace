import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minsteps1 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();sc.close();
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		int count=0;
		while(n!=1){
			if(n%3!=0){return -1;}
			if(n%6==0){n/=6;}
			else{n*=2;}
			count++;
		}
		return count;
	}
}
