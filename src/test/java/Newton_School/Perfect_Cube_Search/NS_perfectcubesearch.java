import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_perfectcubesearch{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        while(i*i*i<=n){
            i++;
        }
        i-=1;
        System.out.println(i*i*i);
    }
}
