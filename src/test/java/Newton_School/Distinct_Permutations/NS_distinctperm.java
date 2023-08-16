import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
public class NS_distinctperm {
    static int[] fact=new int[12];
    static void factorial(){
        fact[0]=1;
        for(int i=1;i<12;i++){
            fact[i]=fact[i-1]*i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();sc.close();
        int len=s.length();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        factorial();
        int ans=fact[len];
        for(int i:map.values()){
            ans/=fact[i];
        }
        System.out.println(ans);
    }
}
