import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),odd=k,even=n-k;
        System.out.println(Math.min(odd,even)+((k-Math.min(odd,even))/3));
    }
}
