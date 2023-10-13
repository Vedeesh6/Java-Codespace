import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_evenindex{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int arg=sc.nextInt();
            System.out.print(i%2==0?(arg+" "):"");
        }
        sc.close();
    }
}
