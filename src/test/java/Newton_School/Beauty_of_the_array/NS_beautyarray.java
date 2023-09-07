import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_beautyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count_odd=0,count_even=0;
        for(int i=0;i<n;i++){
            long temp=sc.nextLong();
            if(temp%2==0){
                count_even++;
            }else{
                count_odd++;
            }
        }
        System.out.println(Math.min(count_odd,count_even)*2+(count_odd==count_even?0:1));
    }
}
