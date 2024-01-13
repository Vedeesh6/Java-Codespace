import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_findsinglenum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,sum_t=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            if(!set.contains(t)){
                set.add(t);
                sum+=t;
            }
            sum_t+=t;
        }sc.close();
        System.out.println((3*sum-sum_t)/2);
    }
}
