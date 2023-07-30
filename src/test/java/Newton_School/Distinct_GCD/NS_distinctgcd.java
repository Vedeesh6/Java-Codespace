import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_distinctgcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        boolean flag2=false;
        ArrayList<Integer> gcdarr = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            boolean flag=false;
            for(int j=x;j<=y;j++){
                int arg=gcd(i,j);
                if(!gcdarr.contains(arg)){
                    gcdarr.add(arg);flag=true;break;
                }
            }
            if(!flag){flag2=true;break;}
        }
        System.out.println(flag2?"NO":"YES");
    }

    private static int gcd(int i, int j) {
        if(j==0)return i;
        return gcd(j,i%j);
    }
}
