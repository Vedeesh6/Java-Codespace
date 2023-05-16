import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_lovetri {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=1;i<n+1;i++){
            map.put(i,sc.nextInt());
        }sc.close();
        System.out.println(lovetriangle(map));
    }

    private static String lovetriangle(HashMap<Integer, Integer> map) {
        for(int i=1;i<map.size()+1;i++){
            int j=map.get(i);
            int k=map.get(j);
            if(map.get(k)==i){
                return "YES";
            }
        }
        return "NO";
    }
}
