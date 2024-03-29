import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_sumofnonrepnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1) res+=i;
        }
        System.out.println(res);
    }
}
