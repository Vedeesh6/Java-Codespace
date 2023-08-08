import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.*;

public class NS_ramavgspeed{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        double d1=sc.nextDouble(),s1=sc.nextDouble(),d2=sc.nextDouble(),s2=sc.nextDouble();
        System.out.println(new DecimalFormat("0.00").format((d1+d2)/(d1/s1+d2/s2)));
    }
}
