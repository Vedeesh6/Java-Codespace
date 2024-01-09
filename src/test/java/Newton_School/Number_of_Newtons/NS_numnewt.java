import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_numnewt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next().toLowerCase();sc.close();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='n' || ch=='e' || ch=='t' || ch=='w' || ch=='o'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(Math.min(map.getOrDefault('n',0)/1,Math.min(map.getOrDefault('e',0)/1,Math.min(map.getOrDefault('t',0)/1,Math.min(map.getOrDefault('w',0)/1,map.getOrDefault('o',0)/1)))));
    }
}
