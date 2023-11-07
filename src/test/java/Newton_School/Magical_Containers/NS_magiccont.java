import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_magiccont{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count_odd=0,count_even=0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()%2==0) count_even++;
            else count_odd++;
        }sc.close();
        System.out.println(count_even+(count_odd/2));
    }
}
