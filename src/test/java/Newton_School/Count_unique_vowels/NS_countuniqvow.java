import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_countuniqvow {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'){
                hs.add(c);
            }
        }
        System.out.println(hs.size());
    }
}
