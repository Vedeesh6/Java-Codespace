import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxblack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),max=0;
        for(int i=0;i<n;i++){
            int count=0;
            char[] arr=new char[m];
            arr=sc.next().toCharArray();
            for(int j=0;j<m;j++){
                if(arr[j]=='#') count++;
            }
            if(count>max) max=count;
        }sc.close();
        System.out.println(max);
    }
}
