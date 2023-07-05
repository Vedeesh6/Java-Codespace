import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_makeitnrs {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLong()%2==0?"Yes":sc.nextLong()%2!=0?"Yes":"No");sc.close();
    }
}
