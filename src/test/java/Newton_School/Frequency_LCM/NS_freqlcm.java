import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_freqlcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int lcm=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(lcm==0){
                lcm = entry.getValue();
            }else{
                lcm = lcm*entry.getValue()/gcd(lcm,entry.getValue());
            }
        }
        System.out.println(lcm);
    }

    private static int gcd(int lcm, Integer value) {
        if(value==0){
            return lcm;
        }
        return gcd(value,lcm%value);
    }
}
