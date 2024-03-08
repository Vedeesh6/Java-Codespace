import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_lexomin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if(n==26) sb.append("xaa");
        else if(n==52) sb.append("zya");
        else{
            sb.append("z".repeat(n/26));
            if(sb.length()!=3){
                sb.append((char)(n%26-(3-sb.length()-1)+96));
                sb.append("a".repeat(3-sb.length()));
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
