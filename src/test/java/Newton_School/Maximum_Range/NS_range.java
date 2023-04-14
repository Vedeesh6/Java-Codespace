import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_range {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){int ele=sc.nextInt();hs.add(ele);hs.add(-ele);}
        System.out.println(hs.size()>n?n:hs.size());
    }
}
