import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();int n=s.length();int x=countvowels(s,n);sc.close();
        System.out.println((n-x==x)?"Yes":"No");
    }

    private static int countvowels(String s, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
