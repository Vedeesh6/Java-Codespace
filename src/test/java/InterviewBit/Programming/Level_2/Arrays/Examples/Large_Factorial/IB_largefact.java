import java.math.*;
import java.util.*;
public class IB_largefact {
    public String solve(int A) {
        if(A<=1){return "1";}
        else{
            BigInteger b1=new BigInteger(solve(A-1));
            BigInteger b2=new BigInteger(String.valueOf(A));
            b1=b1.multiply(b2);
            return b1.toString();
        }
    }
}
