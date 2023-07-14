import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_oddevenprod {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		String s=sc.next();sc.close();
		int sum_odd=0,sum_even=0;
		for(char c:s.toCharArray()){
			int arg=c-'0';
			if(arg%2==0){sum_even+=arg;}
			else{sum_odd+=arg;}
		}
		System.out.println(sum_odd*sum_even);
	}
}
