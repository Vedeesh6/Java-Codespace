import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_vikasandperm {
    static int countDer(int n)
    {
        // Base cases
        if (n == 1) return 0;
        if (n == 2) return 1;
         
        // countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
        return (n - 1) * (countDer(n - 1) + 
                          countDer(n - 2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDer(n));
    }
}
