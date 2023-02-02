package Java;
import java.util.*;
public class gks_gbus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i = 1;i<=n;i++){
            int n_o_t=scan.nextInt();
            int[] C = new int[n_o_t*2];
            for (int j = 0; j < n_o_t*2; ++j) {
                C[j] = scan.nextInt();
            }
            int n1=scan.nextInt();
            for(int k=0;k<n1;k++){
                int count=0;
                int tt=scan.nextInt();
                for (int j = 0; j < C.length-1; j=j+2) {
                    int s=C[j];int f=C[j+1];
                    if(tt>=s && tt<=f){
                        count++;
                    }
                }C[k]=count;
            }
            System.out.print("Case #"+i+": ");
            for(int k=0;k<n1;k++){
                System.out.print(C[k]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
/*
2
4
15 25 30 35 45 50 10 20
2
15
25
10
10 15 5 12 40 55 1 10 25 35 45 50 20 28 27 35 15 40 4 5
3
5
10
27

 */