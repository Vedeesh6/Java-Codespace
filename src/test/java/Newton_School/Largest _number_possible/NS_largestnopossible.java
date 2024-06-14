import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_largestnopossible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt(),i=0;
        StringBuilder sb=new StringBuilder();
        for(;i<n && s>=9;i++){
            sb.append(9);
            s-=9;
        }
        if(i==n && s>0){
            System.out.println(-1);
            return;
        }
        if(i<n){
            sb.append(s);
            for(i++;i<n;i++) sb.append(0);
        }
        System.out.println(sb.toString());
    }
}
