import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_incrementsal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(add_1(arr));
    }

    public static String add_1(int[] arr){
        int len=arr.length;
        int[] res=new int[len+1];
        int carry=1;
        for(int i=len-1;i>=0;i--){
            int sum=arr[i]+carry;
            if(sum>=10){
                carry=1;
                res[i+1]=sum-10;
            }else{
                carry=0;
                res[i+1]=sum;
            }
        }
        if(carry==1){
            res[0]=1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++){
            if(i==0&&res[i]==0){
                continue;
            }
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
