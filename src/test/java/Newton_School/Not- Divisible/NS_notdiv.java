import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_notdiv{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),K=sc.nextInt()+N;sc.close();
        System.out.println((int) (K + Math.floor((K - 1) / (N - 1))));
    }
}
