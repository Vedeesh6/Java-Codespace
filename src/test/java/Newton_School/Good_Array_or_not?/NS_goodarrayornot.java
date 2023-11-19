import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_goodarrayornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0) {
            System.out.println("No");
            return;
        }
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            map.put(x,map.getOrDefault(x, 0) + 1);
        }sc.close();
        if(map.size()!=n/2) {
            System.out.println("No");
            return;
        }
        for(long x: map.keySet()) {
            if(map.get(x)!=2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
