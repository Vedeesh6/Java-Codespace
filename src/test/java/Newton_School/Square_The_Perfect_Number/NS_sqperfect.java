import java.util.*;

public class NS_sqperfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        System.out.println(perfectnumber(n)?n*n:-1);
    }

    private static boolean perfectnumber(int n) {
        int sum=1;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                //System.out.println(i+" "+n/i);
                sum+=i;
                sum+=n/i;
            }
        }
        return sum==n;
    }
}
