import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_nthrowpascaltri{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()-1,prev = 1;
        System.out.print(prev);
     
        for(int i = 1; i <= n; i++){
            int curr = (prev * (n - i + 1)) / i;
            System.out.print(" " + curr);
            prev = curr;
        }
    }
}
