import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class NS_rajtiapaint {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        System.out.print(n-((n/m)+(n%m==1?1:0))>k?"Yes":"No");
    }
}
