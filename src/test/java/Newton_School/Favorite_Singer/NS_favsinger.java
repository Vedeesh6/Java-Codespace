import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_favsinger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashMap<Long,Long> map = new HashMap<>();
        for(long i=0;i<n;i++){
            long x = sc.nextLong();
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1L);
            }
        }
        sc.close();
        long max = 0,count=0;
        for(long i:map.keySet()){
            max=Math.max(max,map.get(i));
        }
        for(long i:map.keySet()){
            if(map.get(i)==max){
                count++;
            }
        }
        System.out.println(count);
    }
}
