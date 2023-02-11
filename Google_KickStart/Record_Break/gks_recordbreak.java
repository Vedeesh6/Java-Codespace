package Java;
import java.util.*;
public class gks_recordbreak {
    public static void main(String[] args) {
        boolean cond1,cond2;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i = 1;i<=n;i++){
            int max=-1;
            int count=0;
            int n1=scan.nextInt();
            int[] C = new int[n1];
            for (int j = 0; j < n1; ++j) {
                C[j] = scan.nextInt();
            }
            for (int k = 0; k < C.length; k++) {
                cond1= C[k]>max;
                if(k+1<n1){
                    cond2=C[k]>C[k+1];
                }else{cond2=true;}
                if(cond1 && cond2){
                    count++;
                }
                if(cond1){
                    max=C[k];
                }
            }
            System.out.println("Case #"+i+": "+count);
        }
        scan.close();
    }
}
/*
4
8
1 2 0 7 2 0 2 0
6
4 8 15 16 23 42
9
3 1 4 1 5 9 2 6 5
6
9 9 9 9 9 9
 */