import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_readnum{
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();sc.close();
		String[] num_word={"one","two","three","four","five","six","seven","eight","nine"};
		String ans="",arg=n+"";
		if(n%2==0){
			for(char c:arg.toCharArray()){
				ans+=num_word[c-49]+" ";
			}
		}else{
			for(int i=arg.length()-1;i>=0;i--){
				ans+=num_word[arg.charAt(i)-49]+" ";
			}
		}
		System.out.println(ans);
	}
}
