import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_countgrids {
    static long count(int N) {
         // code here

        if(N<4)

        return 1;

        else if(N==4)

        return 2;

        else{

        long res[]=new long[N+1];

        res[0]=0;

        res[1]=1;

        res[2]=1;

        res[3]=1;

        res[4]=2;

        int j=1;

        for(int i=5;i<res.length;i++){

            res[i]=res[i-1]+res[j];

            j++;

        }

        return res[N];
        }
    }
 
    // Driver code
    public static void main(String[] args) {
        System.out.print(count(new Scanner(System.in).nextInt()));
    }
}
