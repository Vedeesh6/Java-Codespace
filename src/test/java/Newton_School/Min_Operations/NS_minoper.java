import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minoper{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println(Math.round(Math.ceil((double)((-sc.nextInt())+sc.nextInt())/2)));sc.close();
    }
}
