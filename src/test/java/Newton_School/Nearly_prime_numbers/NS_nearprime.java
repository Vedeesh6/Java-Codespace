import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_nearprime {
    static ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count=3;
        Erasthones(n);
        for(int i=1;i<ans.size();i++){
                if(ans.get(i)-ans.get(i-1)==2){
                    count+=2;
                }else if(ans.get(i)-ans.get(i-1)==1){
                    count++;
                }else{
                    count+=3;
                }
        }
        System.out.println(count);
    }

    public static void Erasthones(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (prime[i]) {
                ans.add(i);
            }
        }
    }
}
