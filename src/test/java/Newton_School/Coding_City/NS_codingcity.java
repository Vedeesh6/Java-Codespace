import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_codingcity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(Character.isDigit(ch))
                map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        String ans="";
        for(char i:map.keySet())
            for(int j=0;j<map.get(i);j++)
                ans+=i+"+";
        System.out.println(ans.substring(0, ans.length()-1));
    }
}
