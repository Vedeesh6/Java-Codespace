import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count_1=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a==1){
                count_1++;
            }
        }sc.close();
        if(count_1==0 && n%2!=0){System.out.println("No");return;}                        
        System.out.println((count_1%2==0)?"Yes":"No");
    }
}
