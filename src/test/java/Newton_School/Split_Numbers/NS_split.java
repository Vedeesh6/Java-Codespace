import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_split {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count=0,count1=0;
        for(int i=0;i<2*n;i++){
            if(sc.nextInt()%2==0)count++;
            else count1++;
        }sc.close();
        System.out.println((count==count1?"Yes":"No"));
    }
}
