import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_perfectarray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();boolean flag=false;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(Math.sqrt(a)!=Math.floor(Math.sqrt(a))){
                flag=true;
                break;
            }
        }sc.close();
        System.out.println(flag?"Yes":"No");
    }
}
