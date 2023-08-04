import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_uniquecons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u'){
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
