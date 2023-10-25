import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_freqofx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int q=sc.nextInt();
        System.out.println(map.get(q)==null?0:map.get(q));sc.close();
    }
}
