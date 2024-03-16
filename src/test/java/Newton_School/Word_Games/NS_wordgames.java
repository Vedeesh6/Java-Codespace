import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_wordgames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),flag=0;
        StringBuilder sb = new StringBuilder(sc.next());
        for(int i=0;i<n;i++){
            if(isVowel(sb.charAt(i))){
                if(flag==1){
                    sb.deleteCharAt(i-1);
                    n--;
                    i--;
                }
                else flag=1;
            }else flag=0;
        }
        System.out.println(sb);
    }

    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y';
    }
}
