import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class NS_mostcraveddish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = 0,id=0;
        for (int i : map.keySet()) {
            if(map.get(i)>max){
                max=map.get(i);id=i;
            }
        }
        System.out.println(id);
    }
}
