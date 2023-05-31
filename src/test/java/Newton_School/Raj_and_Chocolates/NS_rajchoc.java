import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_rajchoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();long sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());sum+=list.get(i);
        }
        sc.close();
        long arg=sum/n,arg1=arg+1,ans=0,ans1=0;
        for(int i=0; i<n; i++) {
            if(list.get(i)>arg) ans+=list.get(i)-arg;
            else if(list.get(i)<arg) ans+=arg-list.get(i);
            if(list.get(i)>arg1) ans1+=list.get(i)-arg1;
            else if(list.get(i)<arg1) ans1+=arg1-list.get(i);
            //System.out.println(ans+" "+ans1);
        }
        System.out.println(Math.min(ans,ans1));
    }
}
