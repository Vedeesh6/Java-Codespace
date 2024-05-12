import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_lexvowelstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();int n=s.length();
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        String ans="";
        for(Character i:map.keySet()){
            ans+=(i+"").repeat(map.get(i));
        }
        System.out.println(ans);
    }

    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
