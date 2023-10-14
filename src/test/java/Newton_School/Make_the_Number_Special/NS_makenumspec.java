import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_makenumspec{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d=sc.nextInt();
        StringBuilder sb=new StringBuilder(sc.next());sc.close();
        for(int i=0;i<n;i++){
            if((sb.charAt(i)-'0')<d){
                sb.insert(i, d);break;
            }else if(i==n-1) sb.append(d);
        }
        System.out.println(sb.toString());
    }
}
