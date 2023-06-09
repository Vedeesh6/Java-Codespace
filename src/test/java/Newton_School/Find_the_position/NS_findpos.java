import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_findpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
              arr[i][j]=sc.nextInt();
        }sc.close();
        int [] row_sum=new int[n];
        int [] col_sum=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                row_sum[i]+=arr[i][j];
                col_sum[j]+=arr[i][j];
            }
        }
        // System.out.println(Arrays.toString(row_sum));
        // System.out.println(Arrays.toString(col_sum));
        int ans_row=0,ans_col=0;
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum=row_sum[i]+col_sum[j]-arr[i][j]-arr[i][j];
                //System.out.println(sum);
                if(sum>max){
                    max=sum;
                    ans_row=i;
                    ans_col=j;
                }
            }
        }
        System.out.println((ans_row+1)+" "+(ans_col+1));
    }
}
