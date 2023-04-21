import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_value {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();long ele=sc.nextLong(),maxprod=0;
        for(int i=1;i<n;i++){
            long ele1=sc.nextLong();
            maxprod=Math.max(maxprod,ele*ele1);
            ele=ele1;
        }sc.close();
        System.out.println(maxprod);
    }
}
