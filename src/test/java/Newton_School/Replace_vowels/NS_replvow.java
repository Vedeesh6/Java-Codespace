import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_replvow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<n;i++){
            if(isVowel(sb.charAt(i))) sb.replace(i,i+1,(char)(((int)sb.charAt(i))+1)+"");
        }
        System.out.println(sb.toString());
    }


    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
