import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_nocrosshandshakes {
    static int count(int N) 
    { 
        if(N==0) return 1;
       int ans=0;
       for(int i=0; i < N; i+=2)
          ans+= count(i)*count(N-2-i);
       
       return ans;
    }
    public static void main (String[] args) {
        int N=new Scanner(System.in).nextInt();
        System.out.println(count(N));
    }
}
