import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_gameon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt(),count1=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(sc.nextInt()==1)
                    count1++;
            }
        }sc.close();
        int min=Math.min(m,n),arg=(min-count1)>=0?min-count1:0;
        System.out.println(arg%2==0?"Bob":"Alice");
    }
}
