package Java.Reference;
import java.io.*;
import java.math.*;
public class BigInteger_prime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger a = new BigInteger(n);
        boolean result = a.isProbablePrime(1);
        if(result==true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        
    }
}
