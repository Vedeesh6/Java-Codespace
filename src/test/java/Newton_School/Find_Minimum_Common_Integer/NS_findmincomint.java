import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_findmincomint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            hs.add(sc.nextInt());
        }
        int m = sc.nextInt(),min = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            int x=sc.nextInt();
            if(hs.contains(x)){
                min = Math.min(min, x);
            }
        }
        System.out.println(min==Integer.MAX_VALUE ? -1 : min);
    }
}
