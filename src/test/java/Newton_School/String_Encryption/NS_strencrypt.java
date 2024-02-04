import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_strencrypt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();StringBuilder ans= new StringBuilder();sc.close();
        int n=s.length();
        for(int i=0;i<n;i++){
            int count=0;
            while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                count++;i++;
            }
            ans.append(s.charAt(i)+""+Integer.toHexString(count+1));
    
        }
        System.out.println(ans.reverse().toString());
    }
}
