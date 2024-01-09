import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_minreps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next(), B=sc.next();sc.close();
        int[] a = new int[26], b = new int[26];
        for(int i=0; i<A.length(); i++) a[A.charAt(i)-'a']++;
        for(int i=0; i<B.length(); i++) b[B.charAt(i)-'a']++;
        int largestdiff=0;
        for(int i=0; i<26; i++){if(a[i]!=0){ largestdiff=b[i]/a[i];}}
        System.out.println(call(largestdiff, A, B));
    }

    public static int call(int largestdiff, String A, String B) {
        String ans = "";
        ans=A.repeat(largestdiff);
        if(ans.contains(B)) return largestdiff;
        else{
            ans+=A;
            if(ans.contains(B)) return largestdiff+1;
            else return -1;
        }
    }
}
