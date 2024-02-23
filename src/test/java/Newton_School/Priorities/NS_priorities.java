import java.util.stream.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_priorities {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int k=sc.nextInt();
        // map.entrySet().stream().sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed().thenComparing(Map.Entry.<Integer, Integer> comparingByKey().reversed())).limit(k).forEach((obje)->{
        //     System.out.print(obje.getKey()+" ");
        // });
        List<Integer> arr=(map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue()).skip(map.size()-k).map(Map.Entry<Integer, Integer>::getKey).collect(Collectors.toList()));
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
