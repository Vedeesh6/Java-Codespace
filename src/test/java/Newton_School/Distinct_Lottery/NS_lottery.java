import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_lottery {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> al = new HashSet<String>();
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(!al.contains(s)){al.add(s);}
        }sc.close();
        System.out.println(al.size()); 
    }
}
