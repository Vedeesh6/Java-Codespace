import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_favsum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		long x=sc.nextLong(),y=sc.nextLong();sc.close();
		System.out.println(x==y?"yes":x==1?"no":x==2?y<=3?"yes":"no":x==3?y<=2?"yes":"no":"yes");
    }
}
