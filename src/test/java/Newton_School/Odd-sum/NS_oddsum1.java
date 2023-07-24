import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_oddsum1.java {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag_odd=false,flag_even=false;int count=0;
        while((!flag_odd || !flag_even) && count<2){
            int n=sc.nextInt();
            if(n%2==0) flag_even=true;
            else flag_odd=true;
            count++;
        }
        System.out.println(flag_odd && flag_even?"YES":"NO");
    }
}
