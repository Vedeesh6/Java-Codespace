import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_cakecut {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong()+1;
		System.out.println(num%2==0?num/2:(num==1)?0:num);
    }
}
