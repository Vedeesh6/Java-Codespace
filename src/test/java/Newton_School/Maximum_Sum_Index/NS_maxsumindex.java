import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxsumindex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE,min_index=1;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x<min){
                min=x;
                min_index=i+1;
            }
        }
        System.out.println(min_index);
    }
}
