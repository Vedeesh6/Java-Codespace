import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_coinsdist {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
        int max=Math.max(a,Math.max(b,c)),diff=(max-a)+(max-b)+(max-c);
        System.out.println(n-diff>=0 && (n-diff)%3==0?"YES":"NO");
    }
}
