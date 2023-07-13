import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_kikimilo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),candies=1,candies_a=0,candies_b=0;sc.close();
		boolean flag_a=false;
		while(true){
			candies_a+=candies;
			candies++;
			candies_b+=candies;
			candies++;
			if(candies_a>a){
				flag_a=true;break;
			}
			if(candies_b>b){
				break;
			}
		}
		System.out.println((!flag_a?"Kiki":"Milo"));
	}
}
