import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_prettynum {
    static long jump(long X) {
        long tmp = X; // for storing 1st digit of number X;
        while(tmp>10){
            tmp/=10;
        }
        long ans = 0;
        Queue<Long> q = new ArrayDeque<>();
        for(int i = 1;i<=tmp;i++){
            q.offer((long)i);
        }
        while(!q.isEmpty()){
            long curr = q.poll();
            if(curr>X) continue;
            ans = Math.max(ans,curr);
            long d = curr%10;
            if(d!=9){
                q.offer(curr*10+d+1);
            }
            if(d!=0){
                q.offer(curr*10+d-1);
            }
        }
        return ans;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(jump(sc.nextLong()));
    }
}
