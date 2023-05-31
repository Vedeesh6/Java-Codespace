import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_uniquenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<n;i++){
            set2.add(sc.nextInt());
        }sc.close();
        System.out.println(set.size()<set2.size()?"Bob":"Alexa");
    }
}
