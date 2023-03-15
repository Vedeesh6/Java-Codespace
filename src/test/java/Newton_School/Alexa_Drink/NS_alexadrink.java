import java.text.*; // for handling format
import java.util.*; // contains Collections framework

public class NS_alexadrink {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(new DecimalFormat("0.00").format(sc.nextDouble()/100*sc.nextDouble()));sc.close();
    }
}
