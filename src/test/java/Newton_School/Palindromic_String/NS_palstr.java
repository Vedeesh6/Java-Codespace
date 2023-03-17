import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_palstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String s=sc.next();sc.close();
        int n=s.length();
        if(n<=1){System.out.println("Yes");return;}
        int i=n-1;int j=0;
        while(i>=0 && s.charAt(i)=='a'){
            i--;
        }
        if(i<0){
            System.out.println("Yes");
            return;
        }
        while(j<n-i-1 && s.charAt(j)=='a'){
            j++;
        }
        s=s.substring(j, i+1);
        System.out.println((new StringBuilder(s).reverse().toString().equals(s))? "Yes" : "No");
    }
}
