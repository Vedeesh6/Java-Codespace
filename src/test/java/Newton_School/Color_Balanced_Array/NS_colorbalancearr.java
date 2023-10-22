import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_colorbalancearr {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count_pos=0,count_neg=0;
        if(n%2!=0){System.out.println("No");System.exit(0);}
        System.gc();
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            if(x>0) count_pos++;
            else if(x<0) count_neg++;
        }sc.close();
        System.out.println(Math.abs(count_pos-count_neg)<=(n-(count_pos+count_neg))? "Yes":"No");
    }
}
