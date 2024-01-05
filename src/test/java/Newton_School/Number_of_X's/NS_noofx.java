import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_noofx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt(),k=sc.nextInt(),count=0;sc.close();
        for(int i=l+1;i<r;i++){
            String num=i+"";
            for(int j=0;j<num.length();j++){
                if(num.charAt(j)==k+'0'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
