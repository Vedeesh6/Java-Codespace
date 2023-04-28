import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_litbulb {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();sc.close();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<4;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }int max=0;
        for(int value:map.values()){
            max=Math.max(max,value);
        }
        System.out.println((max==4)?-1:(max==3)?6:4);
    }
}
