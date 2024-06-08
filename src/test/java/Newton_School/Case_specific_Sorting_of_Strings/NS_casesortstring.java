import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_casesortstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();int len=s.length();
        ArrayList<Character> lc=new ArrayList<Character>(),uc=new ArrayList<Character>();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)) lc.add(c);
            else uc.add(c);
        }
        Collections.sort(lc);Collections.sort(uc);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)) sb.append(lc.remove(0));
            else sb.append(uc.remove(0));
        }
        System.out.print(sb.toString());
    }
}
