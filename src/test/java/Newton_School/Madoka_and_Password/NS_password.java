import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        if(n==1 || n==2){
            System.out.println((n==1)?1:2);return;
        }
        String s=(n%3==1)?"1":"2";
        int sum=(n%3==1)?1:2;
        while(sum<n){
            if(s.charAt(s.length()-1)=='1'){
                s+="2";
                sum+=2;
            }else{
                s+="1";
                sum+=1;
            }
        }
        System.out.println(s);
    }
}
