import java.math.*;
import java.util.*; // contains Collections framework

public class NS_checkpowerof2 {
    public static void main (String[] args) {
        System.out.println(BigInteger.valueOf(new Scanner(System.in).nextInt()).bitCount()==1?"true":"false");
    }
}
