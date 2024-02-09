import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_solvequations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i*i+j == n && i+j*j == m)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
