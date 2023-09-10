import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxholesinpath {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),max_0=0,count_0=0;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp==0){count_0++;}
            else{
                max_0=Math.max(max_0, count_0);
                count_0=0;
            }
        }sc.close();
        max_0=Math.max(max_0, count_0);
        System.out.println(max_0);
    }
}
