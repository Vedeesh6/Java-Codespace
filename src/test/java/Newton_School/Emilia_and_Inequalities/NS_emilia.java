import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_emilia {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println((Math.pow(sc.nextInt(), 2)+Math.pow(sc.nextInt(), 2)<Math.pow(sc.nextInt(), 2))? "Yes":"No");
        sc.close();
    }
}
